package IT2B.allowance;

import java.time.LocalDate;

public class Allowance {

         int amount;
        private LocalDate releasedDate;

        public Allowance(int allowance){
            this.amount = allowance;
        }
    public void printAllowance() {
        System.out.println(getAllowance());
    }


    private int getAllowance() {
            return amount;
        }

        protected void releaseNow(){
            this.releasedDate = LocalDate.now();
            System.out.println("Allowance has been released");
            System.out.println(releasedDate);
        }
}
