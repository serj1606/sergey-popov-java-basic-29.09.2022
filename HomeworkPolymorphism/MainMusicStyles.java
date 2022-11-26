package HomeworkPolymorphism;

import java.util.ArrayList;

public class MainMusicStyles {
    public static void main(String[] args) {

        MusicStyles Kazka = new PopMusic();
        MusicStyles ACDC = new RockMusic();
        MusicStyles Bach = new ClassicMusic();

        MusicStyles[] string = new MusicStyles[]{Kazka, ACDC, Bach};
        for (MusicStyles arr : string) {
            arr.playMusic();
        }
        // мы это не учили но можно и так чз forEach:

        /*RockMusic ACDC = new RockMusic();
        PopMusic Kazka = new PopMusic();
        ClassicMusic Bach = new ClassicMusic();

       ArrayList <MusicStyles> arrayList = new ArrayList<>();

        arrayList.add(ACDC);
        arrayList.add(Kazka);
        arrayList.add(Bach);

       arrayList.forEach(MusicStyles::playMusic);*/

    }
}
