;; 4Clojure Question 16
;;
;; Write a function which returns a personalized greeting.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [name] (apply str "Hello, " name "!")) "Dave") "Hello, Dave!")

(= ((fn [name] (apply str "Hello, " name "!")) "Jenn") "Hello, Jenn!")

(= ((fn [name] (apply str "Hello, " name "!")) "Rhea") "Hello, Rhea!")
