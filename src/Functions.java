class Calculate {

    private String data;
    public void Set_Op(String s){
        data = s;
    }

    public String Get_Op(){
        return data;
    }
}

public class Functions {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.Set_Op("Sum");
        System.out.println(c1.Get_Op());
    }

}
