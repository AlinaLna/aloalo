
package controller;


public class Command {

    public void Command(String command, int chooseCardPo1, int chooseCardPo2) {
        switch (command) {
            case "at" -> {
                /* 1. Chọn hero trên sàn của mình và chọn hero của đối thủ để tấn công */
                
            }
            case "eq" -> {
                /* 2. Chọn hero trên sân và cộng chỉ số trực tiếp vào máu và hp. Thêm nội tại */
            }
            case "rm" -> {
                /* 3. Dùng trực tiếp lên hero của mình hoặc đối thủ */
            }
            case "end" -> {
                
            }
            default -> {
                /*Sai cu phap */
            }
        }
    }
    
    public void Command(String command, int chooseCardPo1) {
        switch (command) {
            case "attack" -> {
                /* 1. Chọn hero trên sàn của mình và chọn hero của đối thủ để tấn công */

            }
            case "equip" -> {
                /* 2. Chọn hero trên sân và cộng chỉ số trực tiếp vào máu và hp. Thêm nội tại */
            }
            case "spell" -> {
                /* 3. Dùng trực tiếp lên hero của mình hoặc đối thủ */
            }
        }
    }
    
    public void Command(String command){
        if(command.equals("spell")){
            
        }
    }
    
    public void Commmand(String command){
        if(command.equals("/help")){
            System.out.println("|======|===========================================|");
            System.out.println("|  at  | your hero position + enemy's hero position|");
            System.out.println("|======|===========================================|");
            System.out.println("|  eq  |     your hero or enemy's position or 0    |");
            System.out.println("|======|===========================================|");     
            System.out.println("|  rm  |          remove your hadling card         |");
            System.out.println("|======|===========================================|");
            System.out.println("| end  |               End your turn               |");
            System.out.println("|======|===========================================|");
        }
    }
    
}
