public class Main {
    public static void main(String[] args) {
        //Задание №1
int a = 4;
byte d = 100;
double c = 1.5;
float f = 3.4f;
long e = 3000000L;
//Задание №2
       float Sport = 78.2f;
       float Sport1 = 82.7f;
       var totalWeight = Sport + Sport1;
        System.out.println("Общий вес боксеров " + totalWeight + " кг!" );
        float difference= Sport1 - Sport ;
        System.out.println("Разница в весе " + difference + " кг! ");
        //Задание №3
        var bananas = 80;
        var milks = 105;
        var cream = 100 ;
        var eggs = 70;
        int inGramm = bananas + milks + cream + eggs ;
        System.out.println("Вес " + inGramm + " грамм");
        float inKg = inGramm / 1000f ;
        System.out.println("Вес " + inKg + " кг");
//Задача №4
        int loseWeight = 7000 ;
        int one = 250;
        int spendDay1 = loseWeight / one;
        System.out.println("Худеть по 250 грамм потребуется " + spendDay1 + " дней!");
        int two = 500 ;
        int spendDay2 = loseWeight / two ;
        System.out.println("Худеть по 500 грамм потребуется " + spendDay2 + " дней!");
        int overLoss = ( spendDay1 + spendDay2) % loseWeight ;
        System.out.println("В среднем потребуется " + overLoss + " дней!" );





    }
}
