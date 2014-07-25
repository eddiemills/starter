(ns clojuretest.core)

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(average [60 80 100 400])

(println (average [60 80 100 400]))
; unsure what println does
; oh no wait, found where it prints to, still unsure about the differences between the repl and what this is

(def person
  {:name "Eddie Mills"
   :town "Tenterden"})

(person :town)?

(def gym
  {:name "Fitness First"
   :location "Ashford"
   ::location "51.150584, 0.868782"})
; unsure what '::' means

gym
; no brackets requ ired?

(quote x)

(symbol? (quote x))

(symbol? (x))

(symbol? (quote 2))

(symbol? (quote +))

(symbol? (quote :a))

(list 'a 'b 'c)
; unsure what ' does

(do
  (println "hi")
  (* 4 5 6))

(let [a (inc (rand-int 6))
      b (inc (rand-int 6))]

  (do
    (println (format "You rolled a %s and a %s" a b))
    (+ a b)))

(defn hypot
  [x y]
  (let [a (* x x)]
    [b (* y y)])
  (Math/sqrt (* a b)))

(hypot (4 5))
; not working, don't know why

(def v [42 "foo" 99.2 [5 12] (rand-int 100)])

(first v)

(second v)

(nth v 3)

(.get v 4)

(+ (first v) (last v))

(let [[a b c] v]
  (+ a c))

(def m {:a 5 :b 6
        :c [7 8 9]
        :d {:e 10 :f 11}
        "foo" 88 ; what is this foo thing about
        42 false})

m
; can't see the uses for maps yet, or why they exist

(let [{a :a b :b} m]
  (+ a b))
