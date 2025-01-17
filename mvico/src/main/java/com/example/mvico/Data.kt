package com.example.mvico


/**
 * Updates the current application state and provides a way to schedule the execution
 * of a Command (side-effect)
 *
 * @param State Current application state.
 * @param Action Incoming action.
 *
 * @return new state and a command (side-effect) to handle. If you don't wish to handle
 * a side-effect, return Pair<State, emptySet()> , otherwise return Pair<State, setOf()>
 */
typealias Reducer<State, Action, SideEffect> = (State, Action) -> Pair<State, Set<SideEffect>>

/**
 * Called every time the MviFeature produces a new state. Used to display
 * the state in the UI
 *
 * @param State the latest state to display
 */
typealias Render<State> = (State) -> Unit
