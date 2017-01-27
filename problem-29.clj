;; 4Clojure Question 29
;;
;; Write a function which takes a string and returns a new string containing only the capital letters.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [x]
      (apply str (re-seq #"[A-Z]+" x))) "HeLlO, WoRlD!") "HLOWRD")

(empty? ((fn [x]
           (apply str (re-seq #"[A-Z]+" x))) "nothing"))

(= ((fn [x]
      (apply str (re-seq #"[A-Z]+" x))) "$#A(*&987Zf") "AZ")
