import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public Tutorial()
    {
        super(900, 540, 1);
        prepare();
 
    }
    

    private void prepare()
    {
        pltut pltut = new pltut();
        addObject(pltut,649,356);
        pltut.setLocation(556,298);
        pltut.setLocation(193,338);
        pltut.setLocation(191,356);
        pltut.setLocation(160,329);
        pltut.setLocation(163,359);
        pltut pltut2 = new pltut();
        addObject(pltut2,495,434);
        pltut pltut3 = new pltut();
        addObject(pltut3,573,473);
        pltut pltut4 = new pltut();
        addObject(pltut4,561,405);
        pltut pltut5 = new pltut();
        addObject(pltut5,392,363);
        pltut pltut6 = new pltut();
        addObject(pltut6,478,389);
        pltut pltut7 = new pltut();
        addObject(pltut7,600,323);
        pltut pltut8 = new pltut();
        addObject(pltut8,486,301);
        pltut pltut9 = new pltut();
        addObject(pltut9,302,336);
        pltut9.setLocation(224,358);
        pltut9.setLocation(222,357);
        pltut9.setLocation(225,358);
        pltut9.setLocation(222,360);
        pltut9.setLocation(293,360);
        pltut9.setLocation(222,358);
        pltut9.setLocation(223,359);
        pltut5.setLocation(283,359);
        pltut5.setLocation(282,359);
        pltut8.setLocation(341,358);
        pltut6.setLocation(400,358);
        pltut2.setLocation(460,357);
        pltut2.setLocation(458,358);
        pltut7.setLocation(517,357);
        pltut4.setLocation(610,356);
        pltut7.setLocation(517,358);
        pltut4.setLocation(576,358);
        pltut3.setLocation(634,358);
        pltut pltut10 = new pltut();
        addObject(pltut10,295,234);
        pltut10.setLocation(257,239);
        pltut pltut11 = new pltut();
        addObject(pltut11,783,463);
        pltut11.setLocation(694,418);
        pltut pltut12 = new pltut();
        addObject(pltut12,771,234);
        pltut12.setLocation(693,297);
        pltut12.setLocation(693,297);
        pltut11.setLocation(693,237);
        pltut10.setLocation(729,119);
        pltut10.setLocation(727,124);
        pltut10.setLocation(693,177);
        pltut pltut13 = new pltut();
        addObject(pltut13,705,388);
        pltut13.setLocation(693,357);
        pltut pltut14 = new pltut();
        addObject(pltut14,383,248);
        pltut14.setLocation(401,300);
        pltut pltut15 = new pltut();
        addObject(pltut15,597,174);
        pltut15.setLocation(633,177);
        pltut15.setLocation(634,177);
        pltut pltut16 = new pltut();
        addObject(pltut16,547,201);
        pltut16.setLocation(575,177);
        pltut16.setLocation(575,177);
        man man = new man();
        addObject(man,238,294);
        man.setLocation(167,297);
        removeObject(pltut14);
        badman badman = new badman();
        addObject(badman,536,299);
        badman badman2 = new badman();
        addObject(badman2,486,296);
        badman badman3 = new badman();
        addObject(badman3,455,301);
        badman3.setLocation(448,295);
        badman.setLocation(533,295);
        pltut pltut17 = new pltut();
        addObject(pltut17,299,233);
        pltut17.setLocation(293,245);
        pltut pltut18 = new pltut();
        addObject(pltut18,396,200);
        pltut18.setLocation(427,196);
        badman.setLocation(622,117);
        badman3.setLocation(353,294);
        badman2.setLocation(561,293);
        badman3.setLocation(301,294);
        badman2.setLocation(426,296);
        removeObject(badman2);
        removeObject(badman);
        pltut18.setLocation(459,202);
        pltut17.setLocation(358,226);
        pltut18.setLocation(461,194);
        badman3.setLocation(626,116);
        sari sari = new sari();
        addObject(sari, 420, 200);
        sari.setLocation(420, 70);
        pltut17.setLocation(355,251);
        pltut17.setLocation(363,229);
        pltut pltut19 = new pltut();
        addObject(pltut19,324,297);
        pltut19.setLocation(268,263);
        pltut18.setLocation(482,194);
        pltut17.setLocation(390,224);
        pltut19.setLocation(300,256);
        pltut pltut20 = new pltut();
        addObject(pltut20,576,109);
        pltut20.setLocation(575,117);
        addObject(pltut,575,58);
        pltut.setLocation(535,278);
        removeObject(pltut);
        man.setLocation(213,271);
    }
}
