(ns isbn-clojure.isbn_validate
    (:require [clojure.string :as str]))

(defn validate_isbn [isbn]
    (str/split isbn #"-"))