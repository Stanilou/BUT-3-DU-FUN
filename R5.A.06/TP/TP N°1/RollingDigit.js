class RollingDigit {

    constructor(parent, x, height, duration = 0.3) {
        this.height = height;
        this.n = 0 ;
        this.duration = duration;
        this.g = parent.appendElement("g", {"font-size": height, "dominant-baseline": "hanging", "fill": "black"});
        this.digits = [];
        for (var compteur = -1; compteur <= 1; compteur++) {
            var text = this.g.appendElement("text", {x: this.x, y: (compteur * this.height)});
            this.digits.push(text);
        }
        this.#update();
    }

    #update() {
        gsap.killTweensOf(this.g);
        gsap.set(this.g, {y: 0});
        this.digits[0].setText((this.n + 9) % 10);
        this.digits[1].setText(this.n % 10);     
        this.digits[2].setText((this.n + 1) % 10);
    }

    set(n) {
        if (n < 0) {
            this.n = 0;
        } else {
            this.n = (n % 10);
        }
        this.#update();
    }

    inc() {
        this.#update();
        this.n = (this.n + 1) % 10;
        gsap.to(this.g, {y: -this.height, ease: "power2.in", duration: this.duration});
    }

    dec() {
        this.#update();
        this.n = (this.n + 9) % 10;
        gsap.to(this.g, {y: this.height, ease: "power2.in", duration: this.duration});
    }

    upTo(n) {
        var target = ((n % 10) + 10) % 10;
        if (this.n !== target) {
            this.#update();
            gsap.to(this.g, {y: -this.height, ease: "power2.in", duration: this.duration, onComplete: () => {
                this.n = (this.n + 1) % 10;
                this.upTo(target);
            }});
        }
    }

    downTo(n) {
        var target = ((n % 10) + 10) % 10;
        if (this.n !== target) {
            this.#update();
            gsap.to(this.g, {y: this.height, ease: "power2.in", duration: this.duration, onComplete: () => {
                this.n = (this.n + 9) % 10;
                this.downTo(target);
            }});
        }
    }

}
