# 🔥 SQL & Java Interactive Quiz Platform - Backend

This is the **backend** of the SQL & Java Interactive Quiz Platform, built using **Spring Boot** and **MongoDB**. It provides REST API endpoints for managing quiz questions and evaluating user responses.

## 🎯 Features
✅ **REST API for Quizzes**: Serves **SQL & Java** multiple-choice questions.  
✅ **MongoDB Integration**: Stores questions and tracks user responses.  
✅ **AI-Powered Hints**: Generates **hints dynamically using AI APIs**.  
✅ **Spring Boot REST API**: Scalable, efficient, and easy to deploy.  
✅ **Custom Scoring & Feedback**: Evaluates answers and provides **explanations**.  

---

## 🛠 Tech Stack
- **Spring Boot 3** (Backend API) 🌱  
- **MongoDB** (Database) 🛢  
- **Spring Data JPA** (Data Layer)  
- **Spring Web** (REST Controllers)  
- **Lombok** (Reduces boilerplate code)  

---

## 🚀 Getting Started

### 1️⃣ **Clone the Repository**
```sh
git clone https://github.com/yourusername/sql-java-quiz-backend.git
cd sql-java-quiz-backend
2️⃣ Set Up MongoDB
Ensure MongoDB is installed and running locally:

mongod --dbpath /your/db/path
Alternatively, you can use a MongoDB Cloud Database (Atlas) and update the connection string.

3️⃣ Configure Environment Variables
Edit src/main/resources/application.properties and update MongoDB connection details:

spring.data.mongodb.uri=mongodb://localhost:27017/quizdb
server.port=8080
4️⃣ Run the Application
mvn spring-boot:run
The backend will be available at http://localhost:8080.

5️⃣ Update Frontend to Match Backend
If needed, update the frontend API URL inside frontend/src/config.ts:

export const API_BASE_URL = "http://localhost:8080";
Change this if the backend runs on a different port.
