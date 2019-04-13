import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        plt plt = new plt();
        addObject(plt,238,380);
        plt.setLocation(278,381);
        plt plt2 = new plt();
        addObject(plt2,381,374);
        plt plt3 = new plt();
        addObject(plt3,583,311);
        plt plt4 = new plt();
        addObject(plt4,675,302);
        plt plt5 = new plt();
        addObject(plt5,359,287);
        plt5.setLocation(329,378);
        plt2.setLocation(404,376);
        plt5.setLocation(338,381);
        plt5.setLocation(336,382);
        plt plt6 = new plt();
        addObject(plt6,366,115);
        plt plt7 = new plt();
        addObject(plt7,366,115);
        plt plt8 = new plt();
        addObject(plt8,366,115);
        plt2.setLocation(396,382);
        plt.setLocation(276,382);
        plt3.setLocation(456,382);
        plt4.setLocation(517,382);
        plt8.setLocation(577,382);
        plt7.setLocation(637,382);
        plt6.setLocation(696,382);
        robo0 robo0 = new robo0();
        addObject(robo0,278,320);
        robo0.setLocation(272,305);
        robo0.setLocation(264,313);
        plt plt9 = new plt();
        addObject(plt9,677,281);
        plt9.setLocation(693,279);
        plt9.setLocation(693,287);
        plt9.setLocation(692,275);
        plt9.setLocation(692,230);
        plt plt10 = new plt();
        addObject(plt10,520,297);
        plt10.setLocation(576,321);
        plt10.setLocation(577,321);
        plt plt11 = new plt();
        addObject(plt11,549,237);
        plt plt12 = new plt();
        addObject(plt12,463,224);
        plt plt13 = new plt();
        addObject(plt13,381,237);
        plt plt14 = new plt();
        addObject(plt14,335,227);
        plt11.setLocation(576,260);
        plt11.setLocation(578,261);
        plt12.setLocation(566,190);
        plt12.setLocation(578,199);
        plt14.setLocation(517,200);
        plt13.setLocation(456,199);
        plt9.setLocation(403,195);
        plt9.setLocation(396,199);
        plt13.setLocation(456,199);
        plt13.setLocation(453,202);
        plt13.setLocation(456,200);
        plt9.setLocation(396,200);
        plt plt15 = new plt();
        addObject(plt15,301,262);
        plt15.setLocation(336,258);
        plt plt16 = new plt();
        addObject(plt16,445,278);
        plt16.setLocation(336,320);
        plt15.setLocation(637,199);
        plt16.setLocation(397,308);
        plt16.setLocation(395,308);
        plt16.setLocation(334,320);
        removeObject(plt16);
        removeObject(plt9);
        removeObject(plt13);
        removeObject(plt14);
        removeObject(plt12);
        removeObject(plt15);
        plt10.setLocation(456,322);
        plt11.setLocation(456,263);
        removeObject(plt10);
        removeObject(plt11);
        plt4.setLocation(515,381);
        plt4.setLocation(515,382);
        plt8.setLocation(575,381);
        plt8.setLocation(575,382);
        plt7.setLocation(635,382);
        plt6.setLocation(695,382);
        badRobo badrobo = new badRobo();
        addObject(badrobo,498,239);
        plt plt17 = new plt();
        addObject(plt17,663,289);
        plt plt18 = new plt();
        addObject(plt18,669,221);
        plt17.setLocation(696,322);
        plt18.setLocation(689,252);
        plt18.setLocation(696,262);
        badRobo badrobo2 = new badRobo();
        addObject(badrobo2,570,243);
        badRobo badrobo3 = new badRobo();
        addObject(badrobo3,614,244);
        laif laif = new laif();
        addObject(laif,30,30);
        laif laif2 = new laif();
        addObject(laif2,60,30);
        laif laif3 = new laif();
        addObject(laif3,90,30);
        laif laif4 = new laif();
        addObject(laif4,120,30);
        laif laif5 = new laif();
        addObject(laif5,150,30);

        removeObject(badrobo2);
        removeObject(plt17);
        removeObject(plt18);
        plt plt19 = new plt();
        addObject(plt19,821,371);
        plt plt20 = new plt();
        addObject(plt20,906,381);
        plt plt21 = new plt();
        addObject(plt21,769,379);
        plt plt22 = new plt();
        addObject(plt22,863,391);
        plt plt23 = new plt();
        addObject(plt23,852,391);
        plt plt24 = new plt();
        addObject(plt24,1038,384);
        plt21.setLocation(755,382);
        plt23.setLocation(966,381);
        plt22.setLocation(1067,383);
        plt19.setLocation(815,382);
        plt20.setLocation(875,382);
        plt23.setLocation(935,382);
        plt24.setLocation(995,382);
        plt22.setLocation(1054,381);
        plt22.setLocation(1054,382);
        Score score = new Score();
        addObject(score,1007,32);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(1040,22);
        score.setLocation(45,65);
        plt22.setLocation(216,382);
        plt plt25 = new plt();
        addObject(plt25,144,399);
        plt25.setLocation(159,382);
        plt plt26 = new plt();
        addObject(plt26,744,187);
        plt plt27 = new plt();
        addObject(plt27,864,266);
        plt plt28 = new plt();
        addObject(plt28,648,184);
        plt28.setLocation(684,185);
        plt28.setLocation(684,188);
        plt27.setLocation(803,187);
        plt27.setLocation(803,187);
        plt28.setLocation(685,187);
        plt24.setLocation(1001,519);
        plt25.setLocation(131,504);
        plt22.setLocation(191,503);
        plt.setLocation(251,503);
        plt22.setLocation(191,504);
        plt.setLocation(251,504);
        plt5.setLocation(311,504);
        plt2.setLocation(371,504);
        plt3.setLocation(431,504);
        plt4.setLocation(491,504);
        plt8.setLocation(552,502);
        plt7.setLocation(613,498);
        plt8.setLocation(551,504);
        plt7.setLocation(611,504);
        plt6.setLocation(671,503);
        plt21.setLocation(731,443);
        plt19.setLocation(792,443);
        plt20.setLocation(855,381);
        plt23.setLocation(917,321);
        removeObject(badrobo3);
        removeObject(badrobo);
        robo0.setLocation(252,402);
        plt27.setLocation(798,259);
        plt26.setLocation(737,258);
        plt28.setLocation(676,196);
        plt plt29 = new plt();
        addObject(plt29,584,202);
        plt29.setLocation(616,195);
        plt plt30 = new plt();
        addObject(plt30,516,194);
        plt30.setLocation(556,195);
        plt plt31 = new plt();
        addObject(plt31,426,200);
        plt plt32 = new plt();
        addObject(plt32,426,200);
        plt32.setLocation(496,195);
        plt31.setLocation(436,195);
        plt plt33 = new plt();
        addObject(plt33,537,123);
        plt33.setLocation(376,195);
        plt plt34 = new plt();
        addObject(plt34,286,197);
        plt34.setLocation(316,195);
        plt plt35 = new plt();
        addObject(plt35,206,182);
        plt35.setLocation(256,195);
        plt plt36 = new plt();
        addObject(plt36,487,130);
        plt36.setLocation(495,135);
        badRobo badrobo4 = new badRobo();
        addObject(badrobo4,784,382);
        badRobo badrobo5 = new badRobo();
        addObject(badrobo5,763,192);
        badRobo badrobo6 = new badRobo();
        addObject(badrobo6,322,119);
        badRobo badrobo7 = new badRobo();
        addObject(badrobo7,921,260);
        removeObject(badrobo5);
        removeObject(badrobo6);
        Boss boss = new Boss();
        addObject(boss,329,131);
        plt24.setLocation(975,323);
        plt24.setLocation(977,321);
        plt27.setLocation(797,258);
        badRobo badrobo8 = new badRobo();
        addObject(badrobo8,548,434);
        plt21.setLocation(732,442);
        plt21.setLocation(732,444);
        plt21.setLocation(732,443);
        plt plt37 = new plt();
        addObject(plt37,411,416);
        plt37.setLocation(372,444);
        plt36.setLocation(497,135);
        plt6.setLocation(671,504);
        score.setLocation(65,65);
    }
}
