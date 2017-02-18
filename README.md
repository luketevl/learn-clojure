# learn-clojure
Learning clojure

# Links
- https://clojure.org/
- https://leiningen.org
- https://gist.github.com/technomancy/2395913


## SYNTAX
- **COMMANDS** | _All_ **COMMANDS** **inside** with **()**
  - **(** _function_ _args_ **)**
```clojure
 (+ 1 2 )
```
- **MAIN PROJECT***
```clojure
(defn -main
  "Comment"
  [& args]
  (commands)
  )
  ```
- **CREATE VARIABLE**
  - (**def** _varName_ **value**)
```clojure
(def age 23)
```
**Create FUNCTIONS**
```clojure
(defn name [param] (Math/pow x 2))
```
**Create FUNCTIONS ANONYMOUS**
```clojure
(fn [param] (Math/pow x 2))
```

- **CREATE NAMESPACE**
```clojure
(ns packageName)
```
- **Call N functions** | Use "**do**"
```clojure
(do
  (fn)
  (fn)
  )
```


### CONDITIONALS
- **EQUALS** as **=**
- **NOT EQUALS** as **not=**
- **IF**
```clojure
(if ( = x 0)
  (**if**Function)
  (**else**Function)
)
```
- **COND** || Equal if() elseif() else
```clojure
(cond
  (conditions) (function)
  (conditions) (function)
  (conditions) (function)
  :else (function)
)
```
- **OR**
```clojure
(or (< x 2) (> x 4))
```


### LOOPS
- **DOSEQ**
```clojure
(doseq [var (seq list)]
  (function)
  (funtion)
  (println var)
)
```




## FUNCTIONS
- **POW**
```clojure
(defn pow3 [x] (Math/pow x 2))
```
- **DECREMENT**
```clojure
(dec x)
```
- **REMAINDER** of _dividing numerator by denominator_.
```clojure
(rem x 2)
```
- **PRINT**
```clojure
(print "Message")
```
- **Return BOOLEAN** added **?** in final
```clojure
(if (functionName? param))
```
- **CONTAINS** | Verify if **contain** _element_ _return boolean_
```clojure
(contains? origin value)
```
- **STRING CONVVERT**
```clojure
(str letter)
```
- **EMPTY**
```clojure
(empty? letter)
```
- **READLINE**
```clojure
(read-line)
```
- **MAP**
```clojure
(map FUNCTION elements)
```
- **REDUCE**
```clojure
(reduce (fn[acc n] (+ acc n)) list)
```
- **LET** _create_ **SCOPE**
```clojure
(let [varName (function or value)]
  (function)
  (function)
)
```
- **RECURSION SYRINGE** | Use _only_ case the **recursion** is the _last_ call
```clojure
(defn game [param]
  (recur param)
)
```
- **PROCCESS SEQUENCIAL LIST**
```clojure
(->> list (map (fn [x] (* x 2))) (reduce (fn[acc n] (+ acc n))))
```

### ARRAY
```clojure
#{element, elementNotEqual}
```
- **REMOVE** _elements_
```clojure
(remove array element)
```
### CONJOINING(GROUP)
- **DECLARE**
```clojure
#{element, elementNotEqual}
```
- **ADDED** _elements_ doesn't **repete**
```clojure
(conj origin element)
```
- **REMOVE** _elements_
```clojure
(disj origin element)
```





## COMMANDS

## CLOJURE
- **RELOAD NAMESPACE**  | _Not cool_
```clojure
(require '[nameSpace.core :as nameSpace] :reload' )
```

### LEIN
- **Run CLI**
  - **exit** | **Exit** **repl**
```shell
lein repl
```
- **CREATE PROJECT**
```shell
lein new app appName
```
- **EXECUTE PROGRAM(main)**
```shell
lein run
```
- **DEPLOY** | _Create_ **package jar**
```shell
lein uberjar
```



# OBSERVATIONS
- **Leiningen** is **boilerplat**
- **Variable** does **not vary** **IMUTABLE**
- **Importante** **files** generated by **leining**
  - In folder **/src/projectName**
- **CLOJURE** use **FUNCTION IN JAVA**
- **ALL FUNCTIONS** have **return**
- **FUNCTIONS**
  - **When** _return_ *boolean** _added_ **?** in your **name**
```clojure
(defn name? [] boolean)
```
  - **When** have **SIDE EFFECT**  _added_ **!** in your **name**
```clojure
(defn name! [] sideEffect)
```
- **LAZY FUNCTION**
> This happens because in functional languages there is the concept of lazy function, which is not executed until its result is requested
