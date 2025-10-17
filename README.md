 📋 Projeto Tarefas Spring Boot

API REST desenvolvida com Spring Boot para gerenciamento de tarefas, com suporte a categorias e status.

 🚀 Tecnologias utilizadas

- ✅ Java 17  
- ✅ Spring Boot  
- ✅ Spring Data JPA / Hibernate  
- ✅ PostgreSQL  
- ✅ Maven

- ** Configure o banco de dados no arquivo application.properties:
- 
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update


- Execute o projeto:
./mvnw spring-boot:run


se preferir, rode pela sua IDE (IntelliJ, VS Code, Eclipse, etc.)


📌 Endpoints principais
- POST /tarefas – Criar uma nova tarefa
- GET /tarefas – Listar todas as tarefas
- POST /categorias – Criar uma nova categoria
- GET /categorias – Listar todas as categorias

🛠️ Funcionalidades em desenvolvimento
- [x] CRUD de tarefas
- [x] Relacionamento com categorias
- [ ] DTOs de entrada e saída
- [ ] Validações com Bean Validation
- [ ] Documentação com Swagger
- [ ] Filtros por categoria e status

👨‍💻 Autor
Miguel Fallen
github.com/miguelfallen


 ⚙️ Como rodar o projeto localmente

1. Clone o repositório:

```bash
git clone https://github.com/miguelfallen/projeto-tarefas-springboot.git
cd projeto-tarefas-springboot 


