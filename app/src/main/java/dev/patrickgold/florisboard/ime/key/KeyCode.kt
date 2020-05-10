package dev.patrickgold.florisboard.ime.key

object KeyCode {
    const val SPACE =                     32
    const val ENTER =                     10
    const val TAB =                        9
    const val ESCAPE =                    27

    const val DELETE =                    -5
    const val DELETE_WORD =               -7
    const val FORWARD_DELETE =            -8

    const val QUICK_TEXT =               -10
    const val QUICK_TEXT_POPUP =        -102
    const val DOMAIN =                    -9

    const val SHIFT =                     -1
    const val ALT =                       -6
    const val CTRL =                     -11
    const val SHIFT_LOCK =               -14
    const val CTRL_LOCK =                -15

    const val ARROW_LEFT =               -20
    const val ARROW_RIGHT =              -21
    const val ARROW_UP =                 -22
    const val ARROW_DOWN =               -23
    const val MOVE_HOME =                -24
    const val MOVE_END =                 -25

    const val SETTINGS =                -100
    const val CANCEL =                    -3
    const val CLEAR_INPUT =              -13
    const val VOICE_INPUT =               -4

    const val DISABLED =                   0

    const val SPLIT_LAYOUT =            -110
    const val MERGE_LAYOUT =            -111
    const val COMPACT_LAYOUT_TO_LEFT =  -112
    const val COMPACT_LAYOUT_TO_RIGHT = -113

    const val UTILITY_KEYBOARD =        -120

    const val CLIPBOARD_COPY =          -130
    const val CLIPBOARD_CUT =           -131
    const val CLIPBOARD_PASTE =         -132
    const val CLIPBOARD_PASTE_POPUP =   -133
    const val CLIPBOARD_SELECT =        -134
    const val CLIPBOARD_SELECT_ALL =    -135

    const val UNDO =                    -136
    const val REDO =                    -137

    const val PHONE_PAUSE =               44
    const val PHONE_WAIT =                59

    const val VIEW_CHARACTERS =         -201
    const val VIEW_SYMBOLS =            -202
    const val VIEW_SYMBOLS2 =           -203
    const val VIEW_NUMERIC =            -204
    const val VIEW_NUMERIC_ADVANCED =   -205
    const val VIEW_PHONE =              -206
    const val VIEW_PHONE2 =             -207
    const val LANGUAGE_SWITCH =         -210
    const val SHOW_INPUT_METHOD_PICKER =-211
    const val URI_COMPONENT_TLD =       -255
}
