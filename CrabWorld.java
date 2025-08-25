import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,300,252);
        Worm worm = new Worm();
        addObject(worm,77,147);
        Worm worm2 = new Worm();
        addObject(worm2,121,120);
        Worm worm3 = new Worm();
        addObject(worm3,424,95);
        Worm worm4 = new Worm();
        addObject(worm4,306,65);
        Worm worm5 = new Worm();
        addObject(worm5,444,169);
        Worm worm6 = new Worm();
        addObject(worm6,209,412);
        Worm worm7 = new Worm();
        addObject(worm7,367,394);
        Worm worm8 = new Worm();
        addObject(worm8,430,288);
        Worm worm9 = new Worm();
        addObject(worm9,122,289);
        Worm worm10 = new Worm();
        addObject(worm10,123,376);
        Worm worm11 = new Worm();
        addObject(worm11,245,358);
        Worm worm12 = new Worm();
        addObject(worm12,298,269);
        Worm worm13 = new Worm();
        addObject(worm13,351,202);
        Worm worm14 = new Worm();
        addObject(worm14,237,163);
        Worm worm15 = new Worm();
        addObject(worm15,265,352);
        Worm worm16 = new Worm();
        addObject(worm16,314,292);
        Worm worm17 = new Worm();
        addObject(worm17,304,224);
        Worm worm18 = new Worm();
        addObject(worm18,244,177);
        Worm worm19 = new Worm();
        addObject(worm19,168,307);
        Worm worm20 = new Worm();
        addObject(worm20,257,329);
        Worm worm21 = new Worm();
        addObject(worm21,297,190);
        Worm worm22 = new Worm();
        addObject(worm22,239,142);
        Worm worm23 = new Worm();
        addObject(worm23,163,350);
        Worm worm24 = new Worm();
        addObject(worm24,223,212);
        Worm worm25 = new Worm();
        addObject(worm25,178,305);
        Worm worm26 = new Worm();
        addObject(worm26,236,315);
        Worm worm27 = new Worm();
        addObject(worm27,248,200);
        Worm worm28 = new Worm();
        addObject(worm28,271,320);
        Worm worm29 = new Worm();
        addObject(worm29,323,278);
        Lobster lobster = new Lobster();
        addObject(lobster,190,362);
        Worm worm30 = new Worm();
        addObject(worm30,383,180);
        Worm worm31 = new Worm();
        addObject(worm31,422,329);
        Worm worm32 = new Worm();
        addObject(worm32,408,459);
        Worm worm33 = new Worm();
        addObject(worm33,213,519);
        Worm worm34 = new Worm();
        addObject(worm34,355,542);
        Worm worm35 = new Worm();
        addObject(worm35,122,497);
        Worm worm36 = new Worm();
        addObject(worm36,58,390);
        Worm worm37 = new Worm();
        addObject(worm37,55,509);
        Worm worm38 = new Worm();
        addObject(worm38,71,115);
        Worm worm39 = new Worm();
        addObject(worm39,62,183);
        Worm worm40 = new Worm();
        addObject(worm40,52,304);
        Worm worm41 = new Worm();
        addObject(worm41,324,30);
        Worm worm42 = new Worm();
        addObject(worm42,125,46);
        Worm worm43 = new Worm();
        addObject(worm43,530,357);
        Worm worm44 = new Worm();
        addObject(worm44,537,173);
        Worm worm45 = new Worm();
        addObject(worm45,536,63);
        Worm worm46 = new Worm();
        addObject(worm46,462,42);
        Worm worm47 = new Worm();
        addObject(worm47,446,530);
        Worm worm48 = new Worm();
        addObject(worm48,459,536);
        Worm worm49 = new Worm();
        addObject(worm49,508,523);
        Worm worm50 = new Worm();
        addObject(worm50,524,451);
        Worm worm51 = new Worm();
        addObject(worm51,476,162);
        Worm worm52 = new Worm();
        addObject(worm52,497,235);
        Worm worm53 = new Worm();
        addObject(worm53,500,323);
        Worm worm54 = new Worm();
        addObject(worm54,493,460);
        Worm worm55 = new Worm();
        addObject(worm55,491,511);
        Worm worm56 = new Worm();
        addObject(worm56,154,192);
        Worm worm57 = new Worm();
        addObject(worm57,199,65);
        Worm worm58 = new Worm();
        addObject(worm58,230,74);
        Worm worm59 = new Worm();
        addObject(worm59,264,108);
        Worm worm60 = new Worm();
        addObject(worm60,359,113);
        Worm worm61 = new Worm();
        addObject(worm61,405,118);
        Worm worm62 = new Worm();
        addObject(worm62,151,107);
        Worm worm63 = new Worm();
        addObject(worm63,62,167);
        Worm worm64 = new Worm();
        addObject(worm64,131,211);
        Worm worm65 = new Worm();
        addObject(worm65,94,209);
        Worm worm66 = new Worm();
        addObject(worm66,119,256);
        Worm worm67 = new Worm();
        addObject(worm67,102,439);
        Worm worm68 = new Worm();
        addObject(worm68,48,420);
        Worm worm69 = new Worm();
        addObject(worm69,90,277);
        Worm worm70 = new Worm();
        addObject(worm70,126,103);
        Worm worm71 = new Worm();
        addObject(worm71,100,147);
        Worm worm72 = new Worm();
        addObject(worm72,287,496);
        Worm worm73 = new Worm();
        addObject(worm73,247,508);
        Worm worm74 = new Worm();
        addObject(worm74,227,509);
        Worm worm75 = new Worm();
        addObject(worm75,162,497);
        Worm worm76 = new Worm();
        addObject(worm76,166,530);
        Worm worm77 = new Worm();
        addObject(worm77,147,473);
        Worm worm78 = new Worm();
        addObject(worm78,90,451);
        Worm worm79 = new Worm();
        addObject(worm79,421,346);
        Worm worm80 = new Worm();
        addObject(worm80,468,396);
        Worm worm81 = new Worm();
        addObject(worm81,420,393);
        Worm worm82 = new Worm();
        addObject(worm82,416,468);
        Worm worm83 = new Worm();
        addObject(worm83,387,445);
        Worm worm84 = new Worm();
        addObject(worm84,323,470);
        Worm worm85 = new Worm();
        addObject(worm85,463,329);
        Worm worm86 = new Worm();
        addObject(worm86,364,360);
        Worm worm87 = new Worm();
        addObject(worm87,355,344);
    }
}
