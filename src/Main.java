public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();// Создаем объект из класса
        int cost = 30_000;// Стоимость билета
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}
//В задании, видимо, какая-то нестыковка, или я что-то путаю. В шаблоне для класса main, указанном на сайте
// в 4 строке стоит переменная price= 10000. По заданию нужно создать класс BonusMilesService и определить в нем метод
//calculate с входным параметром cost, но такая переменная нигде не используется, а используется price.