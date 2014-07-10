(ns clojuretest.core)

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(average [60 80 100 400])

(println (average [60 80 100 400]))
;; unsure what println doe
;; oh no wait, found where it prints to, still unsure about it

(def person
  {:name "Eddie Mills"
   :town "Tenterden"})

(person :town)
;; is executing the def required for this to work?

(def gym
  {:name "Fitness First"
   :location "Ashford"
   ::location "51.150584, 0.868782"})
;; unsure what '::' means

gym
;; no brackets requ ired?

(quote x)

(symbol? (quote x))

(symbol? (quote 2))

(symbol? (quote +))

(symbol? (quote :a))

(list 'a 'b 'c)
;; unsure what ' does

(do
  (println "hi")
  (* 4 5 6))

(let [a (inc (rand-int 6))
      b (inc (rand-int 6))]

  (do
    (println (format "You rolled a %s and a %s" a b))
    (+ a b)))
