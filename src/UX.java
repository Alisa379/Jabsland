import java.io.Serializable;
import java.util.Scanner;

public class UX implements Serializable  {
    private Scanner scanner = new Scanner(System.in);
    private Game game;
    private Player player;
    private Info info;
    public boolean isExt = false;

    public UX(Game game, Player player, Info info) {
        this.game = game;
        this.player = player;
        this.info = info;
    }

    public void mainMenu() {
        System.out.print("\n" + getMainInfo());
        System.out.print("\nГлавное меню:\n1. Выбери регион\n2. Завершить ход\n3. go out\nВыбор: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1" -> doAction();
            case "2" -> {
                game.nextTurn(player);
                if (!game.checkCoins(player)) {
                    printLoosingRegion(game.loosingRegion(player));
                }
            }
            case "3" -> isExt = true;

            default -> {
                System.out.println("Неверная команда.");
                mainMenu();
            }
        }
    }

    public String getMainInfo() {
        return "Всего монет: " + player.getCoinsAmount() + "\n" +
                "Год: " + game.getYearMark() + ". Месяц: " + game.getMonth() + "\n";
    }

    public void doAction() {
        printOwnedRegions();
        System.out.print("\nВыбери регион (название): ");
        Region currentChoice = chooseRegion();
        System.out.print(currentChoice.getFullInfo());
        System.out.print(currentChoice.getPopulationInfo());
        System.out.print("\nВыбери действие:\n1. Действие в своем регионе\n2. Действие в близлежащем регионе\n3. Вернуться в меню\nВыбор: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1" -> actionInOwnedRegions(currentChoice);
            case "2" -> actionInOtherRegion(currentChoice);
            case "3" -> mainMenu();
            default -> {
                System.out.println("Неверная команда.");
                doAction();
            }
        }
    }

    public void actionInOtherRegion(Region from) {
        System.out.println(from.getAdjacentRegions());
        System.out.print("\nВыбери регион (название): ");
        Region to = chooseRegion();
        System.out.println(to.getFullInfo());
        System.out.print("\nВыбери действие:\n1. Атаковать регион\n2. Вести переговоры\n3. Вернуться в меню\nВыбор: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1" -> doAttack(from, to);
            case "2" -> doNegotiation(from, to);
            case "3" -> mainMenu();
            default -> {
                System.out.println("Неверная команда.");
                actionInOtherRegion(from);
            }
        }

    }

    public boolean saveAndGoOut() {
//        System.out.println("Мы пока не научились так делать");
//        mainMenu();
        return false; // это типа вопрос "сохранить и выйти?" а мы отвечаем нет
    }

    public void actionInOwnedRegions(Region currentChoice) {
        System.out.print("Выбери действие:\n1. Прокачать касту жаб\n2. Обучить мирных новой профессии\n3. Разработать артефакт\n4. Исследовать секретное знание\n5. Вернуться в меню\nВыбор: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1" -> levelUp(currentChoice);
            case "2" -> transformCivilians(currentChoice);
            case "3" -> developArtifact(currentChoice);
            case "4" -> openSecretKnowledge(currentChoice);
            case "5" -> mainMenu();
            default -> {
                System.out.println("Неверная команда");
                actionInOwnedRegions(currentChoice);
            }
        }

    }

    public void levelUp(Region region) {
        System.out.print("\nВыбери касту жаб для прокачки (0 - администраторы; 1 - мирные; 2 - ученые; 3 - воители): ");
        int cast = checkDigit();
        System.out.print("\nВведи уровень прокачки: ");
        int level = checkDigit();
        region.levelUp(Jabs.casts.get(cast), level, player);
    }

    public int checkDigit() {
        int digit;
        while (true) {
            String input = scanner.nextLine();
            try {
                digit = Integer.parseInt(input); // преобразуем строку в число
                break; // если всё прошло успешно — выходим из цикла
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное целое число.");
            }
        }
        return digit;
    }

    public void transformCivilians(Region region) {
        System.out.println(region.getPopulationInfo());
        System.out.print("\nВыбери количество мирных для обучения :");
        Integer count = Integer.valueOf(scanner.nextLine());
        System.out.print("\nВыбери касту жаб для обучения (0 - администраторы; 1 - мирные; 2 - ученые; 3 - воители): ");
        Integer cast = Integer.valueOf(scanner.nextLine());
        region.civiliansCastTo(Jabs.casts.get(cast), count);
    }

    public void developArtifact(Region region) {
        if (region.tryToDevelopArtifact(player)) {
            System.out.println("Артефакт получен!");
        }
        else {
            System.out.println("Артефакт не получен");
        }
    }

    public void openSecretKnowledge(Region region) {
        if (region.tryToOpenSecretKnowledge(player)) {
            System.out.println("Секретное знание открыто!");
        }
        else {
            System.out.println("Сектерное знание не открыто");
        }
    }

    public void printAllRegions() {
        System.out.println("\nВсе регионы:");
        for (Region r : game.getRegions()) {
            System.out.println("- " + r.getName());
        }
    }

    public void printGameRules() {
        System.out.println(info.getGameRules());
    }

    public void printGreeting() {
        System.out.println(info.getGreeting());
    }

    public void printLoosingRegion(String name) {
        System.out.println(info.getLoosingRegion(name));
    }

    public void printSuccessfulAttack() {
        System.out.println(info.getSuccessfulAttack());
    }

    public void printSuccessfulNegotiations() {
        System.out.println(info.getSuccessfulNegotiations());
    }

    public void printOwnedRegions() {
        System.out.println("\nТвои регионы:");
        for (Region r : player.getOwnedRegions()) {
            System.out.println("- " + r.getName());
        }
    }

    private void doAttack(Region from, Region to) {
        System.out.print("Количество воинов: ");
        int countWarriorsToSend = checkDigit();

        if (from != null && to != null) {
            if (from.getJabs().getJabsCount().get(Jabs.casts.get(3)) >= countWarriorsToSend) { // проверка введенное число воинов доступно
                if (from.tryToAttack(to, countWarriorsToSend)) { // проверяем через
                    game.successfulAttackRegion(player, to);
                    printSuccessfulAttack();
                }
                else {
                    //вариант провала атаки реализуется в условии try to attack
                    System.out.println("это провал");
                }
            }
            else {
                System.out.println("У вас нет столько воинов");

            }
        }
        else {
            System.out.println("Регионы введены не верно");
        }
    }

    private void doNegotiation(Region from, Region to) {
        System.out.print("Количество учёных: ");
        int countScientistsToSend = checkDigit();

        if (from != null && to != null) {
            if (from.getJabs().getJabsCount().get(Jabs.casts.get(2)) >= countScientistsToSend) { // проверка введенное число воинов доступно
                if (from.tryToNegotiate(to, countScientistsToSend)) { // проверяем через
                    game.successfulNegotiateRegion(player, to);
                    printSuccessfulNegotiations();
                }
                else {
//                вариант провела атаки реализуется в условии try to attack
                    System.out.println("это провал");
                }
            }
            else {
                System.out.println("У вас нет столько ученых");
            }
        }
        else {
            System.out.println("Регионы введены не верно");
        }    }

    private Region chooseRegion() {
        String name = scanner.nextLine();
        for (Region r : game.getRegions()) {
            if (r.getName().equalsIgnoreCase(name)) return r;
        }
        System.out.println("Регион не найден. Попробуй еще раз");
        return chooseRegion();
    }

    public void run() {
        printGreeting();
        printGameRules();
        while ((!player.getOwnedRegions().isEmpty()) | (player.getOwnedRegions().size() != 21)) {
            if (isExt) {
                break;
            }
            mainMenu();
        }
        if ((player.getOwnedRegions().size() != 21)) {
            System.out.println("Вы прошли игру!");
        }
        else if(isExt) {
            System.out.println("Вы сохранили игру");
        }
        else {
            System.out.println("Игра окончена! У вас не осталось регионов");
        }
    }
}

