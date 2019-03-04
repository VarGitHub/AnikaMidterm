package design;

public enum Performance {
   POOR(.05),
   AVERAGE(.08),
   BEST(.1),
   NOTDETERMINED(0);

   private double bonusPercentage;

   private Performance (double bonusPercentage) {
      this.bonusPercentage = bonusPercentage;
   }

   public double getBonusPercentage() {
      return bonusPercentage;
   }
}
