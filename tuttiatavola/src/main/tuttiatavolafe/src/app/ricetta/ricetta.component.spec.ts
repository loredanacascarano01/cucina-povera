import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RicettaComponent } from './ricetta.component';

describe('RicettaComponent', () => {
  let component: RicettaComponent;
  let fixture: ComponentFixture<RicettaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RicettaComponent]
    });
    fixture = TestBed.createComponent(RicettaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
