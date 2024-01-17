## Design Patterns Study - pasta "casosProprios"
Coleção de estudos pessoais de implementações de padrões de projeto (Design Patterns)
### Chain of Responsability
* http://localhost:1234/chainOfResponsability/complexity1  
Implementação que utiliza apenas classe abstrata. Os métodos chamados
não envolvem requisições à services externas.
* http://localhost:1234/chainOfResponsability/complexity2  
Implementação que utiliza apenas classe abstrata. Os métodos chamados
envolvem requisições à services externas. O que se mostrou relevante foi
a que no construtor do último elo ser vazio:
```
  public Person3Type() {  
      this.nextPersonCard = null;  
  }
```
Se setar um PersonCard abstrato (PersonCard):
```
  public Person3Type(PersonCard nextPersonCard) {  
      this.nextPersonCard = null;  
  }
```
ele injeta Autowired's dos outros PersonXType e gera o erro:
```
Parameter 0 of constructor in com.paradigma0621.learning.service.chainofresponsability.complexity2.abstractchain.Person3TypeC2 required a single bean, but 2 were found:
- person1Type: defined in file [/home/lucas.borsatto/Documentos/Lucas-pcPessoal/gitHubParadigma/JAH_SUBI/designPatterns/casosProprios/learning/build/classes/java/main/com/paradigma0621/learning/service/chainofresponsability/complexity2/abstractchain/Person1Type.class]
- person2Type: defined in file [/home/lucas.borsatto/Documentos/Lucas-pcPessoal/gitHubParadigma/JAH_SUBI/designPatterns/casosProprios/learning/build/classes/java/main/com/paradigma0621/learning/service/chainofresponsability/complexity2/abstractchain/Person2Type.class]
```
* http://localhost:1234/chainOfResponsability/complexity3  
Obs IMPORTANTE: Ver caso acima - este caso é o de cima só que deixando a service
centralizada como global apenas na classe abstrata (e tirando as declarações da 
mesma service dos arquivos PersonXType).
