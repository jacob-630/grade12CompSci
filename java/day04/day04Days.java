package day04;

public class day04Days {

    public static String getDay(String day){
        day = day.toLowerCase();
        int random = 100;
        if(day.equals("random")){
            float rand = Math.round(Math.random()*6);
            random = Math.round(rand);
        }
        if( day.equals("monday") || day.equals("mon") || random == 0){
            return "It is actually less likely to rain on Mondays than any other day of the week";
        }
        else if( day.equals("tuesday") || day.equals("tues") || random == 1){
            return "Tuesday is named after Tiw, the Norse god of single combat, victory and glory";
        }
        else if( day.equals("wednesday") || day.equals("wed") || random == 2){
            return "Wednesday is named after Woden, the most important God in the German Pantheon, and is often associated with the Norse God Odin";
        }
        else if( day.equals("thursday") || day.equals("thurs") || random == 3){
            return "Many Germanic-derived languages name Thursday after Thor, like “Torsdag” in Denmark, Norway, and Sweden, “Donnerstag” in Germany, and “Donderlag” in the Netherlands.";
        }
        else if( day.equals("friday") || day.equals("fri") || random == 4){
            return "The English name Friday comes from the Old English Frīġedæġ, meaning “Day of Frige.” This is as a result of the Old English goddess Frigg";
        }
        else if( day.equals("saturday") || day.equals("sat") || random == 5){
            return "Saturday takes its name from Saturn, the Roman god of generation, dissolution, plenty, wealth, agriculture, periodic renewal, and liberation.";
        }
        else if( day.equals("sunday") || day.equals("sun") || random == 6){
            return "Months that begin on a Sunday always have a Friday the 13th in them.";
        }
        else{
            return "invalid input";
        }
    };
}
