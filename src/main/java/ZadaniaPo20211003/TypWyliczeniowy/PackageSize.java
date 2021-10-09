package ZadaniaPo20211003.TypWyliczeniowy;

public enum PackageSize {
    SMALL(1,3), MEDIUM(4,7), LARGE(8,12), UNKNOWN(0,0);

    int min; //w cm
    int max; //w cm

    PackageSize pkgSize;

    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //!!!!!!!!!!!!!!!!!!!!!! wyjasnij
    static PackageSize getPackageSize(int min, int max) {
        if (min>=1 && max<=3) {
            return SMALL;
        } else if (min>=4 && max<=7){
            return MEDIUM;
        } else if (min>=8 && max<=12) {
            return LARGE;
        } else {
            return UNKNOWN;
        }
    }

    static PackageSize getPackageSize2(int min, int max) {
       for (PackageSize packageSize:values()) { //values wyciaga po kolei
           //z enuma robiac z tego tablice
           if (min>= packageSize.min && max< packageSize.max) {
               return packageSize;
           }
       }
       return UNKNOWN;

    }

}


