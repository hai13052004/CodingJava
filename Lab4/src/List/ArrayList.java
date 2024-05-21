public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> kyTu = new ArrayList<String>(3);

        kyTu.add("a");
        kyTu.add("b");
        kyTu.add("c");
        kyTu.add("d");
        kyTu.remove("a");
        

        System.out.println(kyTu.get(1));
        System.out.println(kyTu.contains("Orange"));
        System.out.println(kyTu.size());
        System.out.println(kyTu);
    }
    
}
