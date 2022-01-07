public class BonusMilesService {
    public int calculate(int cost) { //определяем метод calculate

        int moneyPerMiles = 20; //Кол-во потраченых рублей за билет на одну бесплатную милю
        int miles = cost / moneyPerMiles;//Кол-во бесплатных миль
        return miles;

    }
}