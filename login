from flask import Flask, request, jsonify
app = Flask(_name_)
# Example users (in-memory database for simplicity)
users = {"testuser": "password123"}
@app.route('/login', methods=['POST'])
def login():
    username = request.json.get('username')
    password = request.json.get('password')
    if users.get(username) == password:
        return jsonify({"message": "Login successful"}), 200
    return jsonify({"message": "Invalid credentials"}), 401
if _name_ == '_main_':
    app.run(debug=True)
