import java.io.*;
import java.util.List;

public class Main  {

    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("data.bin");
            ObjectInputStream o = new ObjectInputStream(f);

            Object object = o.readObject();
            Game game = new Game();
            if (object instanceof Game) {
                game = (Game) object;
                System.out.println(game.getMonth());
            }
            else{
                System.out.println("не зашли");
            }

            Player player = (Player) o.readObject();
            Info info = (Info) o.readObject();

            Region JB = (Region) o.readObject();
            Region N1 = (Region) o.readObject();
            Region W1 = (Region) o.readObject();
            Region S1 = (Region) o.readObject();
            Region E1 = (Region) o.readObject();
            Region N2 = (Region) o.readObject();
            Region W2 = (Region) o.readObject();
            Region NW2 = (Region) o.readObject();
            Region NE2 = (Region) o.readObject();
            Region S2 = (Region) o.readObject();
            Region E2 = (Region) o.readObject();
            Region SW2 = (Region) o.readObject();
            Region SE2 = (Region) o.readObject();
            Region N3 = (Region) o.readObject();
            Region W3 = (Region) o.readObject();
            Region S3 = (Region) o.readObject();
            Region E3 = (Region) o.readObject();
            Region NW3 = (Region) o.readObject();
            Region NE3 = (Region) o.readObject();
            Region SW3 = (Region) o.readObject();
            Region SE3 = (Region) o.readObject();

            SecretKnowledge SecretJB = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretN1 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretW1 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretS1 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretE1 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretN2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretW2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretNW2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretNE2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretS2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretE2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretSW2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretSE2 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretN3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretW3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretS3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretE3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretNW3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretNE3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretSW3 = (SecretKnowledge) o.readObject();
            SecretKnowledge SecretSE3 = (SecretKnowledge) o.readObject();

            Artifact AJB = (Artifact) o.readObject();
            Artifact AN1 = (Artifact) o.readObject();
            Artifact AW1 = (Artifact) o.readObject();
            Artifact AS1 = (Artifact) o.readObject();
            Artifact AE1 = (Artifact) o.readObject();
            Artifact AN2 = (Artifact) o.readObject();
            Artifact AW2 = (Artifact) o.readObject();
            Artifact ANW2 = (Artifact) o.readObject();
            Artifact ANE2 = (Artifact) o.readObject();
            Artifact AS2 = (Artifact) o.readObject();
            Artifact AE2 = (Artifact) o.readObject();
            Artifact ASW2 = (Artifact) o.readObject();
            Artifact ASE2 = (Artifact) o.readObject();
            Artifact AN3 = (Artifact) o.readObject();
            Artifact AW3 = (Artifact) o.readObject();
            Artifact AS3 = (Artifact) o.readObject();
            Artifact AE3 = (Artifact) o.readObject();
            Artifact ANW3 = (Artifact) o.readObject();
            Artifact ANE3 = (Artifact) o.readObject();
            Artifact ASW3 = (Artifact) o.readObject();
            Artifact ASE3 = (Artifact) o.readObject();

            o.close();

            UX ux = new UX(game, player, info);
            ux.run();

            System.exit(120);

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        SecretKnowledge SecretJB = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretN1 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretW1 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretS1 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretE1 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretN2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabzland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretW2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretNW2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretNE2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretS2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretE2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretSW2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretSE2 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretN3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretW3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretS3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretE3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretNW3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretNE3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretSW3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );
        SecretKnowledge SecretSE3 = new SecretKnowledge(
                "Путеводитель",
                "Старый путеводитель лежал на столе заброшенного дворца. Открыв его, ты видишь детальную карту острова Jabsland: 20 регионов и в центре Jabsburg. Но не это привлекает твоё внимание. Страница порвана, но на месте разрыва там, где не должно быть ничего кроме океана, виднеются обрывки очертания острова. Жаль, авторы не указали его координат…",
                Jabs.casts.get(0),
                0
        );

        Game.getSecretKnowledges().addAll(List.of(SecretJB, SecretN1, SecretW1, SecretS1, SecretE1, SecretN2, SecretW2, SecretNW2, SecretNE2, SecretS2, SecretE2, SecretSW2, SecretSE2, SecretN3, SecretW3, SecretS3, SecretE3, SecretNW3, SecretNE3, SecretSW3, SecretSE3));


        Artifact AJB = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact AN1 = new Artifact(
                "Амулет Болотного Князя",
                "Активация: Погрузить в воду на 10 секунд.",
                "Со дна всплывают золотые монеты.",
                200,
                Jabs.casts.get(1),
                0
        );
        Artifact AW1 = new Artifact(
                "Молот Гномарра",
                "Активация: Ударить по трещине в скале.",
                "Создаёт временные рудные жилы, из которых можно добыть монеты.",
                200,
                Jabs.casts.get(2),
                0
        );
        Artifact AS1 = new Artifact(
                "Зеркало Туманных Видений",
                "Активация: Направить на полную луну.",
                "Показывает места с кладами.",
                200,
                Jabs.casts.get(3),
                0
        );
        Artifact AE1 = new Artifact(
                "Якорь Ненастья",
                "Активация: Бросить в море во время прилива.",
                "Призывает шторм, который выбрасывает на берег ценности с затонувших кораблей.",
                5,
                Jabs.casts.get(0),
                0
        );
        Artifact AN2 = new Artifact(
                "Крио-Коготь",
                "Активация: Провести по поверхности льда.",
                "Создаёт ледяную стену, за которой прячутся  монеты.",
                280,
                Jabs.casts.get(1),
                0
        );
        Artifact AW2 = new Artifact(
                "Плащ Песчаного Духа",
                "Активация: Закутаться в него.",
                "Делает игрока невидимым для песчаных червей, позволяя ограбить их логово и получить монеты.",
                280,
                Jabs.casts.get(2),
                0
        );
        Artifact ANW2 = new Artifact(
                "Семя Вечности",
                "Активация: Закопать в землю под полуденным солнцем.",
                "Вырастает дерево с золотыми плодами.",
                280,
                Jabs.casts.get(3),
                0
        );
        Artifact ANE2 = new Artifact(
                "Молот Вулканида",
                "Активация: Ударить по потоку лавы.",
                "Превращает камень в золотые слитки.",
                280,
                Jabs.casts.get(0),
                0
        );
        Artifact AS2 = new Artifact(
                "Око Хаоса",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact AE2 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ASW2 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ASE2 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact AN3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );

        Artifact AW3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );

        Artifact AS3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact AE3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ANW3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ANE3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ASW3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Artifact ASE3 = new Artifact(
                "Корона Короля Жаб",
                "Активация: Примерить.",
                "Слышится возглас “подать золото королю!”",
                200,
                Jabs.casts.get(0),
                0
        );
        Game.getArtifacts().addAll(List.of(AJB, AN1, AW1, AS1, AE1, AN2, AW2, ANW2, ANE2, AS2, AE2, ASW2, ASE2, AN3, AW3, AS3, AE3, ANW3, ANE3, ASW3, ASE3));




        Region JB = new Region(
                "JabsBurg",
                "Славный город Jabsburg был построен древними жабами в самом центре острова Jabsland, раскинувшегося посреди бескрайнего океана. Когда-то он был столицей Великой Жабьей Империи, но времена изменились. Город в упадке и требует решительных перемен, ведь в сердцах старейших жабов ещё живы воспоминания о его былом значении.",
                80, 0, 2, 1200, 3,
                Game.getArtifacts().getFirst(),
                Game.getSecretKnowledges().getFirst(),
                4, 4, 0, 0,
                1, 1, 1, 1,
                1, 2, 3, 4
        );
        Region N1 = new Region(
                "N1: Greenbog (Зеленое Болото)",
                "Когда-то житница Великой Жабьей Империи, где на террасных полях выращивали «лунный рис» — растение, светящееся в темноте и способное прокормить целую армию. После раскола Империи болота поглотили угодья, а воды стали ядовитыми из-за таинственного ритуала, проведённого отчаявшимися шаманами. Местные жабы, носящие маски из болотной тины, убеждены, что соседи отравили их земли, и устраивают засады на чужаков, используя корни-удавки и топи-ловушки.",
                150, 1000, 3, 2300, 2,
                Game.getArtifacts().get(1),
                Game.getSecretKnowledges().get(1),
                4, 40, 25, 20,
                15, 14, 9, 11,
                0, 4, 8, 5, 7, 2
        );
        Region W1 = new Region(
                "W1: Ironridge (Железный Хребет)",
                "Горный хребет, где добывали «кровавую сталь» — редкий сплав, придающий оружию невероятную прочность. После нашествия иноземцев шахты опустели: легенды гласят, что те украли «Сердце Горы», кристалл, питавший плавильные печи. Теперь жабы-шахтёры, покрытые шрамами от камнепадов, роют туннели вглубь, одержимые идеей вернуть артефакт. В штольнях обитают слепые троглодиты, атакующие любого, кто осмелится зажечь факел.",
                150, 1000, 3, 2300, 2,
                Game.getArtifacts().get(2),
                Game.getSecretKnowledges().get(2),
                4, 40, 17, 18,
                16, 14, 16, 14,
                0, 1, 7, 6, 11, 13
        );
        Region S1 = new Region(
                "S1: Mistmarsh (Туманная Трясина)",
                "Священное место шаманов Империи, где проводили обряды вызова дождей. После катастрофы туманы стали живыми: они душат непрошеных гостей, а их жертвы превращаются в болотные огни. Местные жабы-отшельники носят амулеты из зубов гигантских рептилий, чтобы выжить.",
                150, 1000, 3, 2300, 2,
                Game.getArtifacts().get(3),
                Game.getSecretKnowledges().get(3),
                4, 40, 30, 19,
                15, 14, 13, 15,
                0, 4, 12, 9, 11, 2
        );
        Region E1 = new Region(
                "E1: Bayclaw (Залив Клешни)",
                "Легендарный порт, откуда флот Империи отправлялся покорять океан. После войны с «морскими демонами» (так здесь называют иноземцев) доки заросли ракушками, а на дне залива ржавеет флагманский корабль «Глоттер», нагруженный сокровищами. Жабы-рыбаки ловят электрических угрей, чтобы питать подводные баррикады, и верят, что призрак капитана «Глоттера» охраняет свои богатства.",
                150, 1000, 3, 2300, 2,
                Game.getArtifacts().get(4),
                Game.getSecretKnowledges().get(4),
                4, 40, 35, 30,
                16, 14, 16, 14,
                0, 1, 8, 10, 12, 3
        );
        Region N2 = new Region(
                "N2: Frostspire (Ледяной Шпиль)",
                "Ледяная крепость, где готовили элитных воинов Империи, способных выживать при -50°C. После падения столицы жабы-гвардейцы заморозили себя в саркофагах изо льда, но грохот лавин разбудил их. Теперь они считают всех предателями и атакуют любого, кто приблизится к их цитадели. Лавины и ледяные големы охраняют сокровища, спрятанные в ледяных пещерах.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(5),
                Game.getSecretKnowledges().get(5),
                4, 40, 50, 50,
                16, 14, 14, 14,
                1, 8, 13, 7
        );
        Region W2 = new Region(
                "W2: Sandscar (Песчаный Шрам)",
                "Пустыня, возникшая после того, как иноземцы похитили осушили источники воды. Жабы-кочевники носят воду в пустотелых черепах гигантских жуков. Под песками скрываются руины крепости, где спрятаны древние артефакты, а в оазисах бродят песчаные черви длиной с корабли.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(6),
                Game.getSecretKnowledges().get(6),
                4, 40, 48, 58,
                16, 14, 16, 15,
                2, 7, 14, 11
        );
        Region NW2 = new Region(
                "NW2: Eldertree (Древолесье)",
                "Лес гигантских деревьев, которые когда-то использовались для постройки кораблей Империи. После раскола деревья начали расти со скоростью 1 метр в день, а жабы-друиды слились с корнями, став частью леса.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(7),
                Game.getSecretKnowledges().get(7),
                4, 40, 52, 60,
                16, 14, 15, 16,
                1, 5, 17, 6, 2
        );
        Region NE2 = new Region(
                "NE2: Emberpeak (Пик Углей)",
                "Действующий вулкан, где ковали легендарное оружие для армии Империи. После извержения, уничтожившего кузницы, жабы переселились в пещеры и фанатично охраняют секреты плавки «небесной стали». Лавовые реки текут по руинам, а в кратере вулкана, по слухам, живёт огненный дракон, спящий на груде золота.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(8),
                Game.getSecretKnowledges().get(8),
                4, 40, 49, 44,
                16, 14, 13, 14,
                5, 18, 10, 4, 1
        );
        Region S2 = new Region(
                "S2: Crystalfen (Хрустальная Топь)",
                "Болото, где добывали магические кристаллы, усиливающие силу шаманов. Сейчас кристаллы излучают опасную энергию, вызывающую мутации. Жабы-мутанты, покрытые шипами и светящимися глазами, считают себя «новой элитой» и проводят эксперименты над пленниками, пытаясь создать сверхсущество.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(9),
                Game.getSecretKnowledges().get(9),
                4, 40, 55, 70,
                16, 14, 13, 11,
                15, 12, 4, 2, 11
        );
        Region E2 = new Region(
                "E2: Tidehollow (Приливная Пустошь)",
                "Прибрежная зона, затопляемая дважды в сутки. Жабы построили плавучие города на плотах из ракушечника и торгуют редкими моллюсками, чей жемчуг светится в темноте. Они презирают «сухопутных крыс» и топят корабли тех, кто пытается украсть их богатства.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(10),
                Game.getSecretKnowledges().get(10),
                4, 40, 53, 55,
                16, 14, 13, 12,
                8, 4, 12, 16
        );
        Region SW2 = new Region(
                "SW2: Shadowgrove (Теневой Рощи)",
                "Лес, где никогда не светит солнце. Жабы поклоняются богу тьмы, принося жертвы на каменном алтаре. Деревья шепчут проклятия, а тени крадут воспоминания у тех, кто заснёт под их ветвями. Говорят, в центре рощи лежит «Камень Ночи», украденный Jabsburg’ом.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(11),
                Game.getSecretKnowledges().get(11),
                4, 40, 56, 80,
                16, 14, 12, 9,
                2, 3, 9, 19, 6
        );
        Region SE2 = new Region(
                "SE2: Saltspire (Соляная Вершина)",
                "Шахты, где добывали «слёзы Империи» — соль, которая когда-то была валютой. После обрушения туннелей жабы выживают, продавая соль контрабандистам. В глубине шахт живут соляные големы, оживлённые древними заклинаниями.",
                220, 1600, 4, 3400, 2,
                Game.getArtifacts().get(12),
                Game.getSecretKnowledges().get(12),
                4, 40, 60, 66,
                16, 14, 10, 10,
                3, 4, 10, 20, 9
        );
        Region N3 = new Region(
                "N3: Thunderspire (Громовой Утёс)",
                "Горные пики, где вечно бьют молнии. Жабы-штормовики укрощают гром с помощью медных шестов и верят, что только апокалипсис очистит остров от «предателей». Они проводят ритуалы на вершинах, вызывая штормы, которые уничтожают посевы соседей.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(13),
                Game.getSecretKnowledges().get(13),
                4, 40, 67, 76,
                16, 14, 14, 14,
                17, 5, 18
        );
        Region W3 = new Region(
                "W3: Ashfen (Пепельная Топь)",
                "Земли, сожжённые дотла во время войны с иноземцами. Жабы носят маски из пепла, чтобы скрыть свои лица, и поклоняются духам погибших, проводя ночные ритуалы с факелами.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(14),
                Game.getSecretKnowledges().get(14),
                4, 40, 77, 70,
                16, 14, 16, 15,
                17, 6, 19
        );
        Region S3 = new Region(
                "S3: Venomcanopy (Ядовитый Полог)",
                "Джунгли, где каждое растение, гриб и даже роса смертельно ядовиты. Жабы-алхимики создают зелья и отвары и живут в домах на деревьях, спрятавшись среди лиан.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(15),
                Game.getSecretKnowledges().get(15),
                4, 40, 80, 72,
                16, 14, 15, 16,
                19, 9, 20
        );
        Region E3 = new Region(
                "E3: Wavecove (Волновая Бухта)",
                "Пиратское гнездо, где жабы-корсары грабят корабли под флагом «Кровавой Медузы». Здесь спрятаны украденные чертежи кораблей иноземцев, но пираты не могут их расшифровать. Они проводят дни в тавернах, пьянствуя и играя в кости на украденные сокровища.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(16),
                Game.getSecretKnowledges().get(16),
                4, 40, 75, 84,
                16, 14, 13, 14,
                10, 18, 20
        );
        Region NW3 = new Region(
                "NW3: Moonscar (Лунный Шрам)",
                "Регион, где ночь длится шесть месяцев. Жабы-астрономы строят обсерватории и изучают звёзды, отрицая угрозу нашествия. Они верят, что пророчество — ложь, а истинная опасность придёт из космоса. Днём они спят в подземных убежищах, защищаясь от солнечных лучей.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(17),
                Game.getSecretKnowledges().get(17),
                4, 40, 72, 88,
                16, 14, 13, 11,
                13, 7, 14
        );
        Region NE3 = new Region(
                "NE3: Ironvein (Железная Жила)",
                "Заброшенный промышленный комплекс, где создавали механических солдат для Империи. Жабы-механики оживили роботов по древним чертежам и мечтают заменить «слабых» жаб машинами. Конвейеры всё ещё работают, а в цехах ржавеют гигантские боевые големы.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(18),
                Game.getSecretKnowledges().get(18),
                4, 40, 69, 79,
                16, 14, 13, 12,
                13, 16, 8
        );
        Region SW3 = new Region(
                "SW3: Bonehollow (Костяная Пустошь)",
                "Пустыня, усыпанная костями гигантских существ. Жабы-некроманты пытаются оживить армию скелетов, но духи сопротивляются, насылая проклятия. Они живут в башнях из черепов и верят, что смерть — это лишь начало.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(19),
                Game.getSecretKnowledges().get(19),
                4, 40, 74, 70,
                16, 14, 12, 9,
                14, 11, 15
        );
        Region SE3 = new Region(
                "SE3: Sunspire (Солнечный Шпиль)",
                "Оазис вечного лета, где жабы-гедонисты проводят время в праздниках, игнорируя угрозу нашествия. Их дворцы из мрамора и золота мародёров, но стражники-гладиаторы убивают любого, кто попытается украсть их богатства.",
                300, 1600, 5, 4000, 2,
                Game.getArtifacts().get(20),
                Game.getSecretKnowledges().get(20),
                4, 40, 72, 81,
                16, 14, 10, 10,
                12, 15, 16
        );
        Game.getRegions().addAll(List.of(JB, N1, W1, S1, E1, N2, W2, NW2, NE2, S2, E2, SW2, SE2, N3, W3, S3, E3, NW3, NE3, SW3, SE3));


        Game game = new Game();
        Player player = new Player();
        Info info = new Info();
        UX ux = new UX(game, player, info);
        player.addOwnedRegion(Game.getRegions().getFirst());

        Game.getRegions().getFirst().toOwned(player);

        ux.run();



        try {
            FileOutputStream f = new FileOutputStream("data.bin");
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(game);
            o.writeObject(player);
            o.writeObject(info);

            for (Region r: Game.getRegions()) {
                o.writeObject(r);
            }

            for (SecretKnowledge s: Game.getSecretKnowledges()) {
                o.writeObject(s);
            }

            for (Artifact a: Game.getArtifacts()) {
                o.writeObject(a);
            }

            o.close();}

        catch(Exception e) {
            e.printStackTrace();
        }



    }
}
