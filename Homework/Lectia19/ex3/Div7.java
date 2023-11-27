public class Div7 {
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        int c = 0;
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException("Limit inferioara mai mare ca cea superioara");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0)
                c++;
        }
        
        return c;
    }
}
