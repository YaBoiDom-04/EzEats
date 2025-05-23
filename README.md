# EzEatsAndroidApp
Final Project for my CS374 - Intro to Mobile App Development Course

<h1> EZ Eats 🍽️ </h1>

Your go-to app for discovering, organizing, and enjoying your favorite meals with ease.

<h2>Overview </h2>
EZ Eats is a food discovery and meal planning app designed to help users explore recipes, organize grocery lists, and streamline their cooking experience. Whether you're meal prepping or looking for quick dinner ideas, EZ Eats makes it simple and fun.

![2](https://github.com/user-attachments/assets/626f22b0-8d6f-4ec8-bb39-0ae0b5893654)
![4](https://github.com/user-attachments/assets/b615cf6a-a810-4f43-9ea4-e8fa98c92b2c)

This app was created with Android Studio, rendered with JetPack Compose.

## 📲 Features

- 🔎 **Smart Search**  
  Easily search recipes from countless trusted websites using Google’s Custom Search Engine and JSoup.

- 🧾 **Recipe Viewer**  
  View and save your favorite recipes directly in the app with custom layouts optimized for both portrait and landscape modes.

- 📁 **Bookmark & Sync**  
  Save recipes locally using Room or sync across devices with AWS DynamoDB after account login.

- ⚙️ **Custom Filters**  
  Filter recipes to exclude unwanted ingredients or meal types and sort based on your personal preferences.

- 💬 **Share Recipes**  
  Easily share your favorite dishes with others via Android’s messaging features.

---

## 🧱 Architecture

- **Frontend**: Android with Jetpack Compose  
  - Composables used: Scaffold, LazyColumn, Row, etc.  
  - Screens: Home, Search, Bookmarks, Account, Recipe View  
- **Navigation**: Android NavHost  
- **APIs**: JSoup, Google CSE, AWS, Android View, AWS DynamoDB, Google Custom Search API, Google Programmable Search Engine, DuckDuckGo Search     
            Engine
- **Storage**:
  - Local: Room (single-user device)
  - Online: AWS DynamoDB (multi-device sync)

---

## 🛠️ Setup Instructions

To run this project locally:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/ez-eats.git
   cd ez-eats

2. **Open in Android Studio**:
Open the project in Android Studio and let it sync the Gradle dependencies.

3. **Configure APIs**
Get a Google Custom Search Engine key and CX ID.
Set up AWS credentials and configure DynamoDB.
Insert your keys into the appropriate config files (use .env or local properties for security).

4. **Build and Run**
Connect an emulator or Android device, then click Run.

🖼️ **Screenshots**

📍 **Home Page**

<img width="148" alt="Screenshot 2025-05-23 at 4 23 05 PM" src="https://github.com/user-attachments/assets/1f8d2aae-e96d-4cb4-aec3-f23d3133cbaa" />

🔍 **Search Page**

<img width="148" alt="Screenshot 2025-05-23 at 4 23 43 PM" src="https://github.com/user-attachments/assets/23c0a091-3d4e-4e4b-80ef-f77bd7c18563" />

<img width="256" alt="Screenshot 2025-05-23 at 4 23 53 PM" src="https://github.com/user-attachments/assets/5bff728f-c955-417f-bed1-c446d7f51334" />

📚 **Bookmarks**

<img width="148" alt="Screenshot 2025-05-23 at 4 25 27 PM" src="https://github.com/user-attachments/assets/0d061673-48e6-45a8-a8eb-e42817d8d4fe" />

<img width="148" alt="Screenshot 2025-05-23 at 4 25 35 PM" src="https://github.com/user-attachments/assets/fe43b5a9-4f11-4ceb-8836-36518c386b05" />

👤 **Account Page**

<img width="148" alt="Screenshot 2025-05-23 at 4 36 53 PM" src="https://github.com/user-attachments/assets/19754383-3684-40e8-b6cf-a5c62dc93fa0" />

📖 **Recipe View**

<img width="148" alt="Screenshot 2025-05-23 at 4 24 44 PM" src="https://github.com/user-attachments/assets/b0cc1885-fc4a-48d3-9095-823a08ad584b" />

<img width="148" alt="Screenshot 2025-05-23 at 4 25 01 PM" src="https://github.com/user-attachments/assets/b4ea5abc-13ec-432d-95ce-ce8c5dc52e1f" />
