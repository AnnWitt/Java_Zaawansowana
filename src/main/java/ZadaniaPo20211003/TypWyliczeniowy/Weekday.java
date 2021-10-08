package ZadaniaPo20211003.TypWyliczeniowy;

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


     boolean isWeekDay(){

        if (this!=SATURDAY && this!=SUNDAY) { //this bo w tym enumie
            return true;
        } else {
            return false;
        }
    }

     boolean isHoliday(){
        if (this==SATURDAY || this==SUNDAY) { //this bo w tym enumie
            return true;
        } else {
            return false;
        }
    }

     void whichIsGreater(Weekday weekday) {
         if (compareTo(weekday)>0){
             System.out.println(weekday + " wcześniejszy");
         } else if (compareTo(weekday)<0) {
             System.out.println(weekday + " późniejszy");
         } else {
             System.out.println(weekday + " Ten sam dzień");
         }


    }



}


