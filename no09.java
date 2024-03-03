package Praktikum01;
public class no09 {
    public static void main(String[] args) {
        String[] type = {"String","int","byte","short","double","Integer","Double","Byte","Short"};
        int t = 0;
        for (int i = 1; i <= 100; i++) {
            t = t % type.length;
            System.out.println(type[t++]+" Varinst"+i+";");
            
        }
        
        for (int i = 1; i <= 100; i++) {
            t = t % type.length;
            System.out.println("static "+type[t++]+" Varclass"+i+";");
            
        }
        
        
        for (int i = 1; i <= 100; i++) {
            t = t % type.length;
            System.out.println(type[t++]+" VarLocal"+i+";");
            
        }
        for (int i = 1; i <= 100; i++) {
            t = t % type.length;
            System.out.println(type[t++]+" VarPara"+i+",");
            
        }
        
        
    }
    
}
