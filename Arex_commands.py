import webbrowser

def arax_command(command):
    command = command.lower().strip()

    if "chrome" in command or "fiverr" in command:
        webbrowser.open("https://www.fiverr.com")

    elif "youtube" in command:
        webbrowser.open("https://www.youtube.com")

    else:
        print("ARAX: Command not recognised")

if __name__ == "__main__":
    arax_command(input("ARAX: What should I open? "))
