public class BonusMilesService {
    public int calculate(int price) {
        int rate = 20; // количество рублей для одной бонусной мили
        int bonus = price / rate;
        return bonus;
    }
}
