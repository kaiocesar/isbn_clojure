(ns isbn-clojure.core
  (:require [isbn-clojure.isbn_validate :as isbn_validate]))

(defn -main []  
  (println (isbn_validate/validate_isbn "3-598-21508-8")))
