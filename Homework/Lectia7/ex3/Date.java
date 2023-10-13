public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (valYear(year))
            this.year = year;
        else
            this.year = 0;

        if (valMonth(month))
            this.month = month;
        else
            this.month = 0;
        
        if (valDay(day))
            this.day = day;
        else
            this.day = 0;
    }
    
    private boolean valDay(int x) {
        if (month == 2) {
            if (year % 4 != 0) {
                if ((x > 0) && (x <= 28))
                    return true;
            }
            else
                if ((x > 0) && (x <= 29))
                    return true;
            return false;
        }

        if (month % 2 == 0) {
            if ((x > 0) && (x <= 30))
                return true;
            return false;
        }
        if ((x > 0) && (x <= 31))
            return true;
        return false;
    }
    
    private boolean valMonth(int x) {
        if (x > 0 && x <= 12)
            return true;
        return false;
    }

    private boolean valYear(int x) {
        if (x >= 1)
            return true;
        return false;
    }

    public void setDay(int day) {
        if (valDay(day))
            this.day = day;
        else
            this.day = 0;
    }

    public void setMonth(int month) {
        if (valMonth(month))
            this.month = month;
        else
            this.month = 0;
    }

    public void setYear(int year) {
        if(valYear(year))
            this.year = year;
        else
            this.year = 0;
    }

    public void displayDate() {
        System.out.println(day+"/"+month+"/"+year);
    }
}
