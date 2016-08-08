;(print "Hello World!!!!")
;(println "Hello world")
;(println (+ 1 2 4 2))
;(println (str "Hello " " World" " New"))

;(println 
;	"Hello World")

;comment start
(comment
(if true
	(println "The true condition")
	(println "the false condition"))



(if false
	(println "The true condition")
	(println "the false condition"))


(doseq [arg *command-line-args*]
	(println arg))

);comment end

;(println (second *command-line-args*))

(comment
; printing commandline arguments	
(def x (second *command-line-args*))
(println (str "The argument passed is " x))
)


; if else if else condition
(def myArg (second *command-line-args*))
(cond (= myArg "2") (println "The argument is Two")
	(= myArg "4") (println "The argument is Four")
	:else (println "Invalid arguments"))


	