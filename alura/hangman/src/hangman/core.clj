(ns hangman.core
  (:gen-class))

(def total-lifes 6)

(defn lose [] (print "You lose"))

(defn game [lifes]
  (if ( = lifes 0)
    (lose)
    (do
      (print lifes)
      (game (dec lifes))
    )
  )
)

(def fib [x]
  (if (= x 0) 0
  (if (= x 1) 1
  (+ (fib (dec x)) (fib (- x 2)))))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
