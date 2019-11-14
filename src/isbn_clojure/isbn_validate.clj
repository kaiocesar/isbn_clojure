(ns isbn-clojure.isbn_validate
    (:require [clojure.string :as str]))

(defn str-to-int [string]
    (map (fn [n] (Integer/parseInt n)) (re-seq #"\d" string)))

(defn times-to-each [numbers]
    (map * (range 10 0 -1) (str-to-int numbers)))

(defn validate_isbn [isbn]
    (mod (reduce + (times-to-each isbn)) 11))