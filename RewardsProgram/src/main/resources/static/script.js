function totalPoints(purchase.amount) {

         let firstHundred = 0;
         let onePointTotal = 0;
         let extra = 0;
         let twoPointsTotal = 0;
         let points = 0;
         if (amount < 50) {
           console.log('No rewards earned.');
         } else if (amount >= 50 && amount < 100) {
           firstHundred = amount - 50;

         } else {
           firstHundred = 50;
           extra = amount - 100;
         }
         onePointTotal = firstHundred * 1;
         twoPointsTotal = extra * 2;
         totalPointsEarned = onePointTotal + twoPointsTotal;

         return points;
         }