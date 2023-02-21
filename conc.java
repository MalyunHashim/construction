package construction;

public class conc {
  int x;
  String building;

  public conc(int x) {
     this.x=x;

  }

  public conc(String house){
      building=house;
  }

    public static void main(String[] args) {
        conc M=new conc(8);
        conc k=new conc("house");
        System.out.println(M.x);
        System.out.println(k.building);
    }
}
