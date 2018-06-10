# GraphQL Demo
This projects to demo the features of GraphQL. [![Build Status](https://travis-ci.org/jjwtan/graphql-java-demo.png?branch=master)](https://travis-ci.org/jjwtan/graphql-java-demo)


### What is GraphQL
GraphQL is a query language, created by Facebook with the purpose of building client applications based on intuitive and flexible syntax, for describing their data requirements and interactions.

### Benefits of GraphQL
- Allows client to request a customized (limited or expanded) set of data.
- Only necessary to have one URL for all data fetching and mutating.


## Running
Run the application and go the link to access graphiql
http://localhost:8080/graphiql
and the following link to access the h2 console
http://localhost:8080/h2-console

## H2 Console
For the h2 console
enter the jdbc url below to see the tables that has been created.
```
jdbc:h2:mem:testdb
```

## Entities
- Author
- Book

For more information on the entities, you can use the schema on the graphiql to check.

## Sample mutation queries

### Creation of book and return of author
```
mutation {
  newBook(
    title:"my first book",
  	isbn: "12345",
    pageCount: 12,
    author: 3
  ) {
    author{
      firstName
      lastName
    }
  }
}
```

### Querying for the count
```
query {
     countAuthors
}
```

### Querying for specific fields in an entity
For example if you want to query all the books and get all their title and author first name,
the query will be as follows:
```
query {
  findAllBooks{
    title
    author{
      firstName
    }
  }
}

```
