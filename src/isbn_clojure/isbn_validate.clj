(ns isbn-clojure.isbn_validate
    (:require [clojure.string :as str]))

(defn str-to-int [string]
    (map (fn [n] (Integer/parseInt n)) (re-seq #"\d" string)))

(defn validate_isbn [isbn]
    (str-to-int isbn))