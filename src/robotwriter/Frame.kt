package robotwriter

import java.awt.Robot
import javax.swing.*

class Frame: JFrame() {
    var textArea = JTextArea()
    var labelWaitTime = JLabel("Wait time:")
    var textFieldWaitTime = JTextField()
    var buttonEnableRobot = JButton("ENABLE")

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(300, 300)
        layout = null
        title = "Robot Writer"

        add(textArea)
        textArea.setBounds(10, 10, 280, 100)

        add(labelWaitTime)
        labelWaitTime.setBounds(10, 140, 100, 24)

        add(textFieldWaitTime)
        textFieldWaitTime.toolTipText = "Time in seconds the robot waits before getting enabled"
        textFieldWaitTime.setBounds(120, 140, 50, 24)

        add(buttonEnableRobot)
        buttonEnableRobot.setBounds(10, 170, 280, 24)
        buttonEnableRobot.addActionListener {
            buttonEnableRobotOnClick()
        }
    }

    private fun buttonEnableRobotOnClick() {
        try {
            val waitTime = textFieldWaitTime.text.toLong() * 1000
            Thread.sleep(waitTime)
        } catch (ex: NumberFormatException){
            Thread.sleep(3000)
        }

        performKeyboardAction(Robot(), textArea.text)
    }
}