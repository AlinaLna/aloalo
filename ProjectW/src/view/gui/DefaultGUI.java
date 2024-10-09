package view.gui;

import model.gui.Frame;
import model.gui.Panel;

public class DefaultGUI extends Frame{
    //---------game tag-------------
    private final Panel playerTag_1 = new Panel(0,0,250,25,255,0,0);
    private final Panel playerTag_2 = new Panel(252,0,250,25,255,0,0);        
    //--------player 1 display------
    private final Panel EquipmentSlot_1_1 = new Panel(0,27,125,160,220,220,220);
    private final Panel EquipmentSlot_1_2 = new Panel(0,187,125,160,210,210,210);
    private final Panel EquipmentSlot_1_3 = new Panel(0,347,125,160,220,220,220);
    private final Panel HeroSlot_1_1 = new Panel(125,27,125,160,210,210,210);
    private final Panel HeroSlot_1_2 = new Panel(125,187,125,160,220,220,220);
    private final Panel HeroSlot_1_3 = new Panel(125,347,125,160,210,210,210);
    //-------player 2 display-------
    private final Panel EquipmentSlot_2_1 = new Panel(377,27,125,160,220,220,220);
    private final Panel EquipmentSlot_2_2 = new Panel(377,187,125,160,210,210,210);
    private final Panel EquipmentSlot_2_3 = new Panel(377,347,125,160,220,220,220);
    private final Panel HeroSlot_2_1 = new Panel(252,27,125,160,210,210,210);
    private final Panel HeroSlot_2_2 = new Panel(252,187,125,160,220,220,220);
    private final Panel HeroSlot_2_3 = new Panel(252,347,125,160,210,210,210);
    //-----------liner--------------
    private final Panel middleLine = new Panel(250,0,2,550,0,0,0);
    private final Panel tagOutline = new Panel(0,25,850,2,0,0,0);
    private final Panel boardOutline = new Panel(502,0,2,550,0,0,0);
    //---------console board--------
    private final Panel playerConsoleTag = new Panel(504,0,350,25,255,0,0);
    private final Panel playerStats = new Panel(504,27,350,25,0,255,0);
    private final Panel handleList = new Panel(504,52,130,250,0,255,255);
    private final Panel targetCard = new Panel(634,52,205,250,255,255,0);
    private final Panel consoleChat =  new Panel(504,302,350,50,0,0,255);
    private final Panel actionDisplayer = new Panel(504,352,350,157,0,255,255);
    
    public DefaultGUI(String title, int height, int width) {
        super(title, height, width);    
        frame.add(playerTag_1.getPanel());
        frame.add(playerTag_2.getPanel());
        frame.add(EquipmentSlot_1_1.getPanel());
        frame.add(EquipmentSlot_1_2.getPanel());
        frame.add(EquipmentSlot_1_3.getPanel());
        frame.add(HeroSlot_1_1.getPanel());
        frame.add(HeroSlot_1_2.getPanel());
        frame.add(HeroSlot_1_3.getPanel());
        frame.add(EquipmentSlot_2_1.getPanel());
        frame.add(EquipmentSlot_2_2.getPanel());   
        frame.add(EquipmentSlot_2_3.getPanel());
        frame.add(HeroSlot_2_1.getPanel());  
        frame.add(HeroSlot_2_2.getPanel());
        frame.add(HeroSlot_2_3.getPanel());
        frame.add(middleLine.getPanel());
        frame.add(tagOutline.getPanel());
        frame.add(boardOutline.getPanel());
        frame.add(playerConsoleTag.getPanel());  
        frame.add(playerStats.getPanel());
        frame.add(handleList.getPanel());
        frame.add(targetCard.getPanel());
        frame.add(consoleChat.getPanel());
        frame.add(actionDisplayer.getPanel());
    }
}
