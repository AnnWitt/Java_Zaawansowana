package z20211017.KasyWZA;

public class MainKlasy {

    Standard standard=new Standard(); //szuka po tej nazwie
    //Standard znajdzie ale innej nie ma osobnego pliku
    //przed new tak naprawde wywikanie metody konstruktora
    Standard.Inner inner=standard.new Inner();
   // Standard.Inner inner=new Standard.Inner(); zadziala tylko jedeni inner static
    StandardStatic standardStatic=new StandardStatic();
    StandardStatic.InnerST inst=new StandardStatic.InnerST();

}
