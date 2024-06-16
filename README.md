#Santander Dev Week #
Java RESTful API criada para a Santander Dev Week.

## Diagrama de classes

```mermaid

classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -String Number
        -float Balance
        -float Limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String Number
        -float Limit
    }

    class News {
        -String Icon
        -String Description
    }

    User "1" *-- "1" Account
    User "1" *-- "0..*" Feature
    User "1" *-- "1" Card
    User "1" *-- "0..*" News
```
