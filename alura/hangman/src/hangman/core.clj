(ns hangman.core
  (:gen-class))

(def total-lifes 6)

(defn lose [] (print "You lose"))
(defn win [] (print "You win"))

(defn letters-remainder [word hits]
  (remove (fn [letter] (contains? hits (str letter))) word)
)

(defn all-words-hits? [words hits]
  (empty? (letters-remainder words hits))
)

(defn write-letter! [] (read-line))

(defn try-ok? [letter-try word] (.contains word letter-try))




(defn game [lifes word hits]
  (if (= lifes 0)
    (lose)
    (if (all-words-hits? word hits)
      (win)
      (do
        (check-try (write-letter!) lifes word hits)
        (print "Try again, bro !")
      )

    )
  )
)
(defn check-try [letter-try lifes word hits]
  (if (try-ok? letter-try word)
    (game lifes word (conj hits letter-try))
    (game (dec lifes) word hits)
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
