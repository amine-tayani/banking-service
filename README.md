# SkyBank Banking Service

A simple Java banking application to perform deposits, withdrawals, and print account statements.


## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/banking-service.git
cd banking-service
```

### 2. Run the project

```bash
mvn compile exec:java -Dexec.mainClass=com.skybank.bankservice.Main
```

### 3. Test the project

```bash
mvn test
```

## 📝 Run Results

```bash
󰣇 projects/java/skybank   master  ? ❯  /usr/bin/env /usr/lib/jvm/java-24-openjdk/bin/java -
XX:+ShowCodeDetailsInExceptionMessages -cp /home/maxima/Desktop/projects/java/skybank/target/classes com.skybank.bankservice.Main 
DATE        | TYPE      | AMOUNT    | BALANCE   
2025-06-24  | DEPOSIT   | 2000      | 2000      
2025-06-24  | WITHDRAW  | 530       | 1470      
2025-06-24  | DEPOSIT   | 100       | 1570      
Account balance: 1570

```
