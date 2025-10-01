class RollingNumber {

    constructor(parent, digitNumber, width, height, duration = 0.3) {
        this.digits = [];
        this.n = 0;
        for (var compteur = 0; compteur < digitNumber; compteur++) {
            var x = (digitNumber - 1 - compteur) * width;
            var digit = new RollingDigit(parent, x, 0, width, height, duration);
            this.digits.push(digit);
        }
        parent.setAttribute('viewBox', `0 0 ${digitNumber * width} ${height}`);
    }

    set(n) {
        for (var compteur = 0; compteur < this.digits.length; compteur++) {
            var digitValue = n % 10;
            this.digits[compteur].set(digitValue);
            n = Math.floor(n / 10);
        }
    }

    to(n) {
        if (n < 0) {
            this.n = 0;
        } else if (n == this.n) {
            return;
        } else {
            var increasing = n > this.n;
            this.n = n;
            for (var i = 0; i < this.digits.length; i++) {
                var digitValue = n % 10;
                if (increasing) {
                    this.digits[i].upTo(digitValue);
                } else {
                    this.digits[i].downTo(digitValue);
                }
                n = Math.floor(n / 10);
            }
        }
    }

}