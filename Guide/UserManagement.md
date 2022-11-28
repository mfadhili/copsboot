When the application runs Spring Data will combine our `UserRepositoryImpl` code with Spring Data's `Crud Repository`. Therefore, methods from both `UserRepositoryCustom` and `CrudRepository` are available wherever `UserRepository` is injected.

The generation of the unique UUID is put behind the `UniqueIdGenerator`
It is needed if you intend to use `long` Values

### Updating the Unit Test
Update to use the `nextId` method
Annotate `InMemoryUniqueIdGenerator` with `@Component` or Create a inner class in your unit-test and annotate with `@TestConfiguration`. 

