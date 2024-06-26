package com.devonfw.tools.ide.cli;

import com.devonfw.tools.ide.process.ProcessResult;

/**
 * {@link CliException} that is thrown if the user aborted further processing due
 */
public final class CliAbortException extends CliException {

  /**
   * The constructor.
   */
  public CliAbortException() {

    super("Aborted by end-user.", ProcessResult.ABORT);
  }

}
