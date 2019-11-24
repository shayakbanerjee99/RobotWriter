package robotwriter

import java.awt.AWTException
import java.awt.Robot

import java.awt.event.KeyEvent

import java.io.IOException

import java.lang.Thread
import java.lang.InterruptedException

/**
 * @author Shayak Banerjee
 * @version 1.0
 * @since 8th November '19
 */

@Throws(IOException::class, AWTException::class, InterruptedException::class)
fun main(args: Array<String>) {
//    val robot = Robot()
//    Thread.sleep(3000)
//
//    try {
//        var n = Integer.parseInt(args[1].trim { it <= ' ' })
//        while (n-- > 0) {
//            robotwriter.performKeyboardAction(robot, args[0])
//        }
//    } catch (ex: ArrayIndexOutOfBoundsException) { // args[1] wasn't provieded
//        robotwriter.performKeyboardAction(robot, args[0])
//    }

    val frame = Frame()
    frame.isVisible = true
}

@Throws(IOException::class, AWTException::class, InterruptedException::class)
fun Robot.pressAndRelease(keyCode: Int) {
    this.keyPress(keyCode)
    this.keyRelease(keyCode)
}

@Throws(IOException::class, AWTException::class, InterruptedException::class)
fun Robot.shiftPressAndRelease(keyCode: Int) {
    this.keyPress(KeyEvent.VK_SHIFT)
    this.pressAndRelease(keyCode)
    this.keyRelease(KeyEvent.VK_SHIFT)
}

fun performKeyboardAction(robot: Robot, message: String) {
    for (i in 0 until message.length) {
        // feeding the character into the when expression
        when (message.substring(i, i + 1)) {
            // Lower case characters
            "a" -> robot.pressAndRelease(KeyEvent.VK_A)
            "b" -> robot.pressAndRelease(KeyEvent.VK_B)
            "c" -> robot.pressAndRelease(KeyEvent.VK_C)
            "d" -> robot.pressAndRelease(KeyEvent.VK_D)
            "e" -> robot.pressAndRelease(KeyEvent.VK_E)
            "f" -> robot.pressAndRelease(KeyEvent.VK_F)
            "g" -> robot.pressAndRelease(KeyEvent.VK_G)
            "h" -> robot.pressAndRelease(KeyEvent.VK_H)
            "i" -> robot.pressAndRelease(KeyEvent.VK_I)
            "j" -> robot.pressAndRelease(KeyEvent.VK_J)
            "k" -> robot.pressAndRelease(KeyEvent.VK_K)
            "l" -> robot.pressAndRelease(KeyEvent.VK_L)
            "m" -> robot.pressAndRelease(KeyEvent.VK_M)
            "n" -> robot.pressAndRelease(KeyEvent.VK_N)
            "o" -> robot.pressAndRelease(KeyEvent.VK_O)
            "p" -> robot.pressAndRelease(KeyEvent.VK_P)
            "q" -> robot.pressAndRelease(KeyEvent.VK_Q)
            "r" -> robot.pressAndRelease(KeyEvent.VK_R)
            "s" -> robot.pressAndRelease(KeyEvent.VK_S)
            "t" -> robot.pressAndRelease(KeyEvent.VK_T)
            "u" -> robot.pressAndRelease(KeyEvent.VK_U)
            "v" -> robot.pressAndRelease(KeyEvent.VK_V)
            "w" -> robot.pressAndRelease(KeyEvent.VK_W)
            "x" -> robot.pressAndRelease(KeyEvent.VK_X)
            "y" -> robot.pressAndRelease(KeyEvent.VK_Y)
            "z" -> robot.pressAndRelease(KeyEvent.VK_Z)

            // Space
            " " -> robot.pressAndRelease(KeyEvent.VK_SPACE)

            // Upper case characters
            "A" -> robot.shiftPressAndRelease(KeyEvent.VK_A)
            "B" -> robot.shiftPressAndRelease(KeyEvent.VK_B)
            "C" -> robot.shiftPressAndRelease(KeyEvent.VK_C)
            "D" -> robot.shiftPressAndRelease(KeyEvent.VK_D)
            "E" -> robot.shiftPressAndRelease(KeyEvent.VK_E)
            "F" -> robot.shiftPressAndRelease(KeyEvent.VK_F)
            "G" -> robot.shiftPressAndRelease(KeyEvent.VK_G)
            "H" -> robot.shiftPressAndRelease(KeyEvent.VK_H)
            "I" -> robot.shiftPressAndRelease(KeyEvent.VK_I)
            "J" -> robot.shiftPressAndRelease(KeyEvent.VK_J)
            "K" -> robot.shiftPressAndRelease(KeyEvent.VK_K)
            "L" -> robot.shiftPressAndRelease(KeyEvent.VK_L)
            "M" -> robot.shiftPressAndRelease(KeyEvent.VK_M)
            "N" -> robot.shiftPressAndRelease(KeyEvent.VK_N)
            "O" -> robot.shiftPressAndRelease(KeyEvent.VK_O)
            "P" -> robot.shiftPressAndRelease(KeyEvent.VK_P)
            "Q" -> robot.shiftPressAndRelease(KeyEvent.VK_Q)
            "R" -> robot.shiftPressAndRelease(KeyEvent.VK_R)
            "S" -> robot.shiftPressAndRelease(KeyEvent.VK_S)
            "T" -> robot.shiftPressAndRelease(KeyEvent.VK_T)
            "U" -> robot.shiftPressAndRelease(KeyEvent.VK_U)
            "V" -> robot.shiftPressAndRelease(KeyEvent.VK_V)
            "W" -> robot.shiftPressAndRelease(KeyEvent.VK_W)
            "X" -> robot.shiftPressAndRelease(KeyEvent.VK_X)
            "Y" -> robot.shiftPressAndRelease(KeyEvent.VK_Y)
            "Z" -> robot.shiftPressAndRelease(KeyEvent.VK_Z)

            // Digits
            "0" -> robot.pressAndRelease(KeyEvent.VK_0)
            "1" -> robot.pressAndRelease(KeyEvent.VK_1)
            "2" -> robot.pressAndRelease(KeyEvent.VK_2)
            "3" -> robot.pressAndRelease(KeyEvent.VK_3)
            "4" -> robot.pressAndRelease(KeyEvent.VK_4)
            "5" -> robot.pressAndRelease(KeyEvent.VK_5)
            "6" -> robot.pressAndRelease(KeyEvent.VK_6)
            "7" -> robot.pressAndRelease(KeyEvent.VK_7)
            "8" -> robot.pressAndRelease(KeyEvent.VK_8)
            "9" -> robot.pressAndRelease(KeyEvent.VK_9)

            // Punctuation Marks
            "," -> robot.pressAndRelease(KeyEvent.VK_COMMA)
            "." -> robot.pressAndRelease(KeyEvent.VK_PERIOD)
            ":" -> robot.shiftPressAndRelease(KeyEvent.VK_COLON)
            "/" -> robot.pressAndRelease(KeyEvent.VK_SLASH)
            "?" -> robot.shiftPressAndRelease(KeyEvent.VK_SLASH)
            "!" -> robot.shiftPressAndRelease(KeyEvent.VK_EXCLAMATION_MARK)
            "@" -> robot.shiftPressAndRelease(KeyEvent.VK_AT)
            "#" -> robot.shiftPressAndRelease(KeyEvent.VK_3)
            "$" -> robot.shiftPressAndRelease(KeyEvent.VK_4)
            "%" -> robot.shiftPressAndRelease(KeyEvent.VK_5)
            "^" -> robot.shiftPressAndRelease(KeyEvent.VK_6)
            "&" -> robot.shiftPressAndRelease(KeyEvent.VK_7)
            "*" -> robot.shiftPressAndRelease(KeyEvent.VK_8)
            "-" -> robot.shiftPressAndRelease(KeyEvent.VK_MINUS)
            "+" -> robot.shiftPressAndRelease(KeyEvent.VK_PLUS)
            "(" -> robot.shiftPressAndRelease(KeyEvent.VK_LEFT_PARENTHESIS)
            ")" -> robot.shiftPressAndRelease(KeyEvent.VK_RIGHT_PARENTHESIS)
        }

        Thread.sleep(5) // waiting for the current action to get registered
    }
}